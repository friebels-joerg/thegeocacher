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

/**
 *
 * @author Jörg Friebel
 * @since 20.01.2015
 */
@Stateless
public class MapTileBean
{
	private static final Logger LOGGER = Logger.getLogger(MapTileBean.class.getSimpleName());
	private MapDataStore mapDataStore;
	private DatabaseRenderer databaseRenderer;
	private DisplayModel displayModel;
	private static RenderThemeFuture renderThemeFuture;
	private XmlRenderTheme xmlRenderTheme;

	public MapTileBean()
	{
		super();
		String homePath = "C:\\swd\\workspaces\\thegeocacher\\thegeocacher\\thegeocacher-ejb\\thegeocacher\\";
		String mapFilename = homePath + "maps\\nordrhein-westfalen.map";
		File mapFile = new File(mapFilename);
		mapDataStore = new MapFile(mapFile);
		TileBasedLabelStore labelStore = new TileBasedLabelStore(100);
		databaseRenderer = new DatabaseRenderer(mapDataStore, AwtGraphicFactory.INSTANCE, labelStore);
		displayModel = new DisplayModel();
		String renderThemeFilename = homePath + "renderthemes\\openmaps\\openmaps.xml";
		File renderThemeFile = new File(renderThemeFilename);
		xmlRenderTheme = null;
		try
		{
			xmlRenderTheme = new ExternalRenderTheme(renderThemeFile);
		}
		catch (FileNotFoundException e)
		{
			LOGGER.log(Level.WARNING, "unexpected", e);
		}
	}

	public BufferedImage getMapTile(Byte aZoom, Integer aX, Integer aY)
	{
		LOGGER.info("get map tile for zoom:" + aZoom + " x:" + aX + " y:" + aY);
		Tile tile = new Tile(aX, aY, aZoom, 256);
		RendererJob rendererJob = createRendererJob(tile);
		TileBitmap tileBitmap = databaseRenderer.executeJob(rendererJob);
		return AwtGraphicFactory.getBitmap(tileBitmap);
	}

	private RendererJob createRendererJob(Tile aTile)
	{
		float textScale = 1.5f;
		boolean isTransparent = false;
		boolean labelsOnly = false;
		return new RendererJob(aTile, mapDataStore, getRenderThemeFuture(), displayModel, textScale, isTransparent,
				labelsOnly);
	}

	private RenderThemeFuture getRenderThemeFuture()
	{
		if (renderThemeFuture == null)
		{
			renderThemeFuture = new RenderThemeFuture(AwtGraphicFactory.INSTANCE, xmlRenderTheme, displayModel);
			new Thread(renderThemeFuture).run();
		}

		return renderThemeFuture;
	}
}