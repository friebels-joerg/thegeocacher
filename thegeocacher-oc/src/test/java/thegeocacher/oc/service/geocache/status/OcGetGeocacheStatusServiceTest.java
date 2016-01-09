package thegeocacher.oc.service.geocache.status;

import thegeocacher.oc.service.geocache.status.OcGetGeocacheStatusService;
import org.junit.Test;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheStatus;

/**
 *
 * @author joerg
 */
public class OcGetGeocacheStatusServiceTest
{

   public OcGetGeocacheStatusServiceTest()
   {
   }

   /**
    * Test of getGeocacheStatus method, of class OcServices.
    */
   @Test
   public void testGetGeocacheStatus()
   {
      System.out.println("getGeocacheStatus");
      GeocacheCode aGeocacheCode = new GeocacheCode("OC1234");
      OcGetGeocacheStatusService instance = new OcGetGeocacheStatusService();
      GeocacheStatus result = instance.getGeocacheStatus(aGeocacheCode);
   }

}
