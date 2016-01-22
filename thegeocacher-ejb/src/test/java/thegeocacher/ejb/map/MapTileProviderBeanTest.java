package thegeocacher.ejb.map;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import thegeocacher.ejb.map.MapTileProviderBean;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2015
 */
public class MapTileProviderBeanTest
{

   @Test
   @Ignore
   public void test()
   {
      MapTileProviderBean serviceUndetTest = new MapTileProviderBean();

      BufferedImage tile = serviceUndetTest.getMapTile((byte) 13, 4249, 2734);
      assertNotNull(tile);
   }

}
