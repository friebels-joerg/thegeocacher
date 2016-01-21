package thegeocacher.ejb.mapsforge;

import java.awt.image.BufferedImage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2015
 */
public class MapTileBeanTest
{

	@Test
	public void test()
	{
		MapTileBean serviceUndetTest = new MapTileBean();

		BufferedImage tile = serviceUndetTest.getMapTile((byte) 13, 4249, 2734);
		assertNotNull(tile);
	}

}
