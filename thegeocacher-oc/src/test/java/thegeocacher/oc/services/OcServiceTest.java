/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegeocacher.oc.services;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author joerg
 */
public class OcServiceTest
{
   @Test
   public void testGetUrl()
   {
      QueryParameters someQueryParameters = new QueryParameters();
      someQueryParameters.put("cache_code", "OC0ED1");
      OcService serviceUnderTest = new OcServiceImpl();
      String expResult = "http://www.opencaching.de/okapi/services/caches/geocache?consumer_key=f8k87aHFAVaCn5K9gAeM&cache_code=OC0ED1";
      String result = serviceUnderTest.getUrl(someQueryParameters);
      Assert.assertEquals(expResult, result);
   }

   public class OcServiceImpl extends OcService
   {
      public AuthenticationLevel getAuthenticationLevel()
      {
         return AuthenticationLevel.Level1;
      }

      public String getMethodName()
      {
         return "services/caches/geocache";
      }
   }

}
