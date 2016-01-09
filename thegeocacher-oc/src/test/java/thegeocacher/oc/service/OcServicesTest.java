package thegeocacher.oc.service;

import org.junit.Test;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheStatus;

/**
 *
 * @author joerg
 */
public class OcServicesTest
{

   public OcServicesTest()
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
      OcServices instance = new OcServices();
      GeocacheStatus result = instance.getGeocacheStatus(aGeocacheCode);
   }

}
