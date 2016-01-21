package thegeocacher.common.util;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2016
 */
public class TheGeocacherPropertiesTest
{
   @Test
   public void testGetUserHome()
   {
      TheGeocacherProperties serviceUnderTest = TheGeocacherProperties.getInstance();
      String result = serviceUnderTest.getUserHome();
      Assert.assertNotNull(result);
   }
}
