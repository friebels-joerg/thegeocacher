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
		Tile tile = new Tile(aX, aY, aZoom, 256);

		File mapFile = new File(
				"C:\\swd\\workspaces\\thegeocacher\\thegeocacher\\thegeocacher-ejb\\thegeocacher\\maps\\nordrhein-westfalen.map");
		LOGGER.info("mapfile:" + mapFile.getAbsolutePath());
		MapDataStore mapDataStore = new MapFile(mapFile);
		XmlRenderTheme xmlRenderTheme = InternalRenderTheme.OSMARENDER;
		DisplayModel displayModel = new DisplayModel();
		RenderThemeFuture renderThemeFuture = new RenderThemeFuture(AwtGraphicFactory.INSTANCE, xmlRenderTheme,
				displayModel);
		float textScale = 1.5f;
		boolean isTransparent = false;
		boolean labelsOnly = false;
		RendererJob rendererJob = new RendererJob(tile, mapDataStore, renderThemeFuture, displayModel, textScale,
				isTransparent, labelsOnly);

		TileBasedLabelStore labelStore = new TileBasedLabelStore(100);
		DatabaseRenderer databaseRenderer = new DatabaseRenderer(mapDataStore, AwtGraphicFactory.INSTANCE, labelStore);
		TileBitmap tileBitmap = databaseRenderer.executeJob(rendererJob);
		BufferedImage tempBitmap = AwtGraphicFactory.getBitmap(tileBitmap);
		return tempBitmap;
	}
}
