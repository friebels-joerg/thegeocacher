package thegeocacher.oc.service.geocache.status;

import org.junit.Assert;
import org.junit.Test;
import thegeocacher.domain.GeocacheStatus;
import thegeocacher.domain.attribute.GeocacheCode;

/**
 *
 * @author joerg
 */
public class OcGetGeocacheStatusServiceTest
{

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
      Assert.assertNotNull(result.getCode());
      Assert.assertNotNull(result.getAvailability());
      Assert.assertNotNull(result.getLastModified());
      System.out.println("result " + result);
   }

}
