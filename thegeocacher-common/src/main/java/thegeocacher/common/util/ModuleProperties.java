package thegeocacher.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Jörg Friebel
 * @since 13.01.2016
 */
public class ModuleProperties
{
   private static final String MODULE_PROPERTIES = "/module.properties";

   private Class<?> classWithinModule;

   private Properties moduleProperties;

   public ModuleProperties(Class<?> anyClassWithinModule)
   {
      classWithinModule = anyClassWithinModule;
   }

   private Properties getModuleProperties()
   {
      if (moduleProperties == null)
      {
         initModuleProperties();
      }
      return moduleProperties;
   }

   private void initModuleProperties()
   {
      try
      {
         moduleProperties = new Properties();
         InputStream inputStream = classWithinModule.getResourceAsStream(MODULE_PROPERTIES);
         moduleProperties.load(inputStream);
      } catch (IOException e)
      {
         throw new IllegalArgumentException("Resourcefile " + MODULE_PROPERTIES + " not found in "
               + getModuleJarName());
      }
   }

   private String getModuleJarName()
   {
      return "" + classWithinModule.getResource('/' + classWithinModule.getName().replace('.', '/') + ".class");
   }

   public String getModuleVersion()
   {
      return getProperty("module.version");
   }

   public String getProperty(String aKey)
   {
      if (getModuleProperties().containsKey(aKey))
      {
         return getModuleProperties().getProperty(aKey);
      }
      throw new IllegalArgumentException("Key " + aKey + " not found in resourcefile " + MODULE_PROPERTIES
            + " within " + getModuleJarName());
   }

}
