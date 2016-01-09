package thegeocacher.oc.service.geocache;

import thegeocacher.oc.service.OcMethod;
import thegeocacher.oc.service.OcService;

public class GetGeocacheService extends OcService
{
   @Override
   protected OcMethod getOcMethod()
   {
      return OcMethod.Geocache;
   }
}
