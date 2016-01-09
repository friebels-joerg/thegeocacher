package thegeocacher.oc.service.geocache.status;

import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheStatus;
import thegeocacher.oc.service.OcMethod;
import thegeocacher.oc.service.OcService;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public class OcGetGeocacheStatusService extends OcService
{
   public OcGetGeocacheStatusService()
   {
      super();
   }

   public GeocacheStatus getGeocacheStatus(GeocacheCode aGeocacheCode)
   {
      OcGetGeocacheStatusParameters parameters = new OcGetGeocacheStatusParameters();
      parameters.setGeocacheCode(aGeocacheCode);

      String result = callOcService(parameters);

      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   protected OcMethod getOcMethod()
   {
      return OcMethod.Geocache;
   }
}
