package thegeocacher.ejb.mapsforge;

import java.awt.image.BufferedImage;
import java.io.File;
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
import org.mapsforge.map.rendertheme.InternalRenderTheme;
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

	public BufferedImage getMapTile(Byte aZoom, Integer aX, Integer aY)
	{
		LOGGER.info("get map tile for zoom:" + aZoom + " x:" + aX + " y:" + aY);
		String mapFilename = "C:\\swd\\workspaces\\thegeocacher\\thegeocacher\\thegeocacher-ejb\\thegeocacher\\maps\\nordrhein-westfalen.map";
		MapDataStore mapDataStore = createDataStore(mapFilename);
		DatabaseRenderer databaseRenderer = createRenderer(mapDataStore);

		Tile tile = new Tile(aX, aY, aZoom, 256);
		RendererJob rendererJob = createRendererJob(tile, mapDataStore, new DisplayModel());
		TileBitmap tileBitmap = databaseRenderer.executeJob(rendererJob);
		return AwtGraphicFactory.getBitmap(tileBitmap);
	}

	private DatabaseRenderer createRenderer(MapDataStore aMapDataStore)
	{
		TileBasedLabelStore labelStore = new TileBasedLabelStore(100);
		DatabaseRenderer databaseRenderer = new DatabaseRenderer(aMapDataStore, AwtGraphicFactory.INSTANCE, labelStore);
		return databaseRenderer;
	}

	private MapDataStore createDataStore(String aMapFilename)
	{
		File mapFile = new File(aMapFilename);
		return new MapFile(mapFile);
	}

	private RendererJob createRendererJob(Tile aTile, MapDataStore aMapDataStore, DisplayModel aDisplayModel)
	{
		RenderThemeFuture renderThemeFuture = createRenderThemeFuture(aDisplayModel);
		float textScale = 1.5f;
		boolean isTransparent = false;
		boolean labelsOnly = false;
		return new RendererJob(aTile, aMapDataStore, renderThemeFuture, aDisplayModel, textScale, isTransparent,
				labelsOnly);
	}

	private RenderThemeFuture createRenderThemeFuture(DisplayModel aDisplayModel)
	{
		XmlRenderTheme xmlRenderTheme = InternalRenderTheme.OSMARENDER;
		return new RenderThemeFuture(AwtGraphicFactory.INSTANCE, xmlRenderTheme, aDisplayModel);
	}
}
