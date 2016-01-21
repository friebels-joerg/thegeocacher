package thegeocacher.common.web;

/**
 *
 * @author Jörg Friebel
 * @since 01.01.2016
 */
public class WebProperties
{
   private static WebProperties instance;

   public static WebProperties getInstance()
   {
      if (instance == null)
      {
         instance = new WebProperties();
      }
      return instance;
   }

   Boolean proxyRequiered = Boolean.FALSE;

   String proxyUser = "dt0a19";
   String proxyPassword = "E$r5t6z7";
   String proxyHost = "squid.intdus.retail-sc.com";
   Integer proxyPort = 3128;
   String proxyScheme = "http";

   public String getProxyHost()
   {
      return proxyHost;
   }

   public String getProxyPassword()
   {
      return proxyPassword;
   }

   public Integer getProxyPort()
   {
      return proxyPort;
   }

   public Boolean isProxyRequiered()
   {
      return proxyRequiered;
   }

   public String getProxyScheme()
   {
      return proxyScheme;
   }

   public String getProxyUser()
   {
      return proxyUser;
   }

}
