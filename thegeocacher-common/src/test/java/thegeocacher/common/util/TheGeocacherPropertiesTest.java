package thegeocacher.common.util;

import java.io.File;
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
   public void testFileExists()
   {
      TheGeocacherProperties serviceUnderTest = TheGeocacherProperties.getInstance();
      final String filename = serviceUnderTest.getAbsolutePropertiesFilename();
      Assert.assertTrue("test will only run when file " + filename + " exists", new File(filename).exists());
   }

   @Test
   public void testGetUserHome()
   {
      TheGeocacherProperties serviceUnderTest = TheGeocacherProperties.getInstance();
      String result = serviceUnderTest.getUserHome();
      Assert.assertNotNull(result);
   }

   @Test
   public void testGetBaseDir()
   {
      TheGeocacherProperties serviceUnderTest = TheGeocacherProperties.getInstance();
      String result = serviceUnderTest.getBaseDir();
      Assert.assertNotNull(result);
   }

   @Test
   public void testGetBaseDirWithUnkownKey()
   {
      TheGeocacherProperties serviceUnderTest = TheGeocacherProperties.getInstance();
      final String UNKOWN_KEY = "unknown";
      String result = serviceUnderTest.getStringValue(UNKOWN_KEY);
      Assert.assertNull(result);
   }
}
