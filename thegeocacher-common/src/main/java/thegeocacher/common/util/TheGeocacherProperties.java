package thegeocacher.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2016
 */
public class TheGeocacherProperties
{
   private static final Logger LOGGER = Logger.getLogger(TheGeocacherProperties.class.getSimpleName());
   private static final String PROPERTY_FILENAME = "thegeocacher.properties";

   Properties properties;
   private static TheGeocacherProperties instance;

   String getUserHome()
   {
      return System.getProperty("user.home");
   }

   final String getFilename()
   {
      return getUserHome() + File.separator + PROPERTY_FILENAME;
   }

   private TheGeocacherProperties()
   {
      super();
      properties = new Properties();
      try
      {
         properties.load(new FileInputStream(getFilename()));
      } catch (IOException ex)
      {
         LOGGER.log(Level.SEVERE, null, ex);
      }
   }

   public static TheGeocacherProperties getInstance()
   {
      if (instance == null)
      {
         instance = new TheGeocacherProperties();
      }
      return instance;
   }

}
