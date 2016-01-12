package thegeocacher.oc.services;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public enum OcSite
{
   PL("Opencaching.PL", "http://opencaching.pl/okapi/"),
   DE("Opencaching.DE", "http://www.opencaching.de/okapi/"),
   US("Opencaching.US", "http://www.opencaching.us/okapi/"),
   NL("Opencaching.NL", "http://www.opencaching.nl/okapi/"),
   RO("Opencaching.RO", "http://www.opencaching.ro/okapi/");

   String siteName;
   String okapiUrl;

   OcSite(String aSiteName, String anOkapiUrl)
   {
      siteName = aSiteName;
      okapiUrl = anOkapiUrl;
   }

   public String getOkapiUrl()
   {
      return okapiUrl;
   }
}
