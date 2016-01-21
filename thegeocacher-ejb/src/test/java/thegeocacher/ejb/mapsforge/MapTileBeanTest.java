package thegeocacher.ejb.mapsforge;

import java.awt.image.BufferedImage;
import static org.junit.Assert.assertNotNull;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2015
 */
public class MapTileBeanTest
{

   @Test
   @Ignore
   public void test()
   {
      MapTileBean serviceUndetTest = new MapTileBean();

      BufferedImage tile = serviceUndetTest.getMapTile((byte) 13, 4249, 2734);
      assertNotNull(tile);
   }

}
