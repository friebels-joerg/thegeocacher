package thegeocacher.oc.services.caches.geocache.status;

import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.oc.services.QueryParameters;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcGetGeocacheStatusParameters extends QueryParameters
{

   public OcGetGeocacheStatusParameters()
   {
      super();
      put("fields", "code|status|last_modified");
   }

   public void setGeocacheCode(GeocacheCode aGeocacheCode)
   {
      put("cache_code", aGeocacheCode.getValue());
   }

}
