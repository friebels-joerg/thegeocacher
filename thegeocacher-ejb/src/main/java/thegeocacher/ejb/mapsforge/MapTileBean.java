package thegeocacher.ejb.mapsforge;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;

import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.model.Tile;
import org.mapsforge.map.awt.graphics.AwtGraphicFactory;
import org.mapsforge.map.datastore.MapDataStore;
import org.mapsforge.map.layer.labels.TileBasedLabelStore;
import org.mapsforge.map.layer.renderer.DatabaseRenderer;
import org.mapsforge.map.layer.renderer.RendererJob;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.reader.MapFile;
import org.mapsforge.map.rendertheme.ExternalRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderTheme;
import org.mapsforge.map.rendertheme.rule.RenderThemeFuture;

import thegeocacher.common.util.TheGeocacherProperties;

/**
 *
 * @author Jörg Friebel
 * @since 20.01.2015
 */
@Stateless
public class MapTileBean
{
	private static final Logger LOGGER = Logger.getLogger(MapTileBean.class.getSimpleName());

	private DatabaseRenderer databaseRenderer;
	private DisplayModel displayModel = new DisplayModel();;

	private String renderThemFilename = "hiking" + File.separator + "hiking.xml";
	private static RenderThemeFuture renderThemeFuture;
	private static Thread renderThemeThread;

	private String mapFilename = "nordrhein-westfalen.map";
	private MapDataStore mapDataStore;

	public BufferedImage getMapTile(Byte aZoom, Integer aX, Integer aY)
	{
		Tile tile = new Tile(aX, aY, aZoom, 256);
		RendererJob rendererJob = getRendererJob(tile);
		TileBitmap tileBitmap = getDatabaseRenderer().executeJob(rendererJob);
		return AwtGraphicFactory.getBitmap(tileBitmap);
	}

	private String getAbsoluteRenderThemeFilename(String aRenderThemFilename)
	{
		return getBaseDir() + File.separator + "renderthemes" + File.separator + aRenderThemFilename;
	}

	private String getBaseDir()
	{
		return TheGeocacherProperties.getInstance().getBaseDir();
	}

	private String getAbsoluteMapFilename(String aMapFilename)
	{
		return getBaseDir() + File.separator + "maps" + File.separator + aMapFilename;
	}

	private RendererJob getRendererJob(Tile aTile)
	{
		float textScale = 1.5f;
		boolean isTransparent = false;
		boolean labelsOnly = false;
		return new RendererJob(aTile, getMapDataStore(), getRenderThemeFuture(), displayModel, textScale, isTransparent,
		      labelsOnly);
	}

	private RenderThemeFuture getRenderThemeFuture()
	{
		if (renderThemeFuture == null)
		{
			String renderThemeFilename = getAbsoluteRenderThemeFilename(renderThemFilename);
			File renderThemeFile = new File(renderThemeFilename);
			XmlRenderTheme xmlRenderTheme = null;
			try
			{
				xmlRenderTheme = new ExternalRenderTheme(renderThemeFile);
			}
			catch (FileNotFoundException e)
			{
				LOGGER.log(Level.WARNING, "unexpected", e);
			}
			renderThemeFuture = new RenderThemeFuture(AwtGraphicFactory.INSTANCE, xmlRenderTheme, displayModel);
			renderThemeThread = new Thread(renderThemeFuture);
			renderThemeThread.run();
		}

		return renderThemeFuture;
	}

	private MapDataStore getMapDataStore()
	{
		if (mapDataStore == null)
		{
			String absoluteMapFilename = getAbsoluteMapFilename(mapFilename);
			File mapFile = new File(absoluteMapFilename);
			mapDataStore = new MapFile(mapFile);
		}
		return mapDataStore;
	}

	private DatabaseRenderer getDatabaseRenderer()
	{
		if (databaseRenderer == null)
		{
			TileBasedLabelStore labelStore = new TileBasedLabelStore(100);
			databaseRenderer = new DatabaseRenderer(mapDataStore, AwtGraphicFactory.INSTANCE, labelStore);
		}
		return databaseRenderer;
	}
}
