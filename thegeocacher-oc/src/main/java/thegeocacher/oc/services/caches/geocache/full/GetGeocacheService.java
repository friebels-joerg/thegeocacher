package thegeocacher.oc.services.caches.geocache.full;

import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

public class GetGeocacheService extends OcService
{
   @Override
   protected OcMethod getOcMethod()
   {
      return OcMethod.CACHES_GEOCACHE;
   }
}
