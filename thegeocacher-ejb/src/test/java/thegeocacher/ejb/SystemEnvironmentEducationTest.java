package thegeocacher.ejb;

import org.junit.Test;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2016
 */
public class SystemEnvironmentEducationTest
{

   @Test
   public void testGetEnv()
   {
      System.getenv().keySet().stream().forEach((key) ->
      {
         System.out.println("key:" + key + " value:" + System.getenv(key));
      });

   }

   @Test
   public void testGetUserHome()
   {
      System.out.println("user.home" + System.getProperty("user.home"));
      System.out.println("user.dir" + System.getProperty("user.dir"));
   }

   @Test
   public void testGetOsName()
   {
      System.out.println("os.name" + System.getProperty("os.name"));
   }

}
