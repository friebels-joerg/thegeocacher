package thegeocacher.oc.service;

/**
 *
 * @author Jörg Friebel
 * @since 01.01.2016
 */
public class OcProperties
{
   static final String CONSUMER_KEY = "f8k87aHFAVaCn5K9gAeM";
   static final String CONSUMER_SECRET = "ahURUXEUcUbhSmgPmPmMBmePgQNqfT2g2MXLBtxD";

   static OcProperties instance = null;

   public static OcProperties getInstance()
   {
      if (instance == null)
      {
         instance = new OcProperties();
      }
      return instance;
   }

   public String getConsumerKey()
   {
      return CONSUMER_KEY;
   }

}
