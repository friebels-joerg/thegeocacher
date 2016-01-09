package thegeocacher.oc.service;

import thegeocacher.common.web.SimpleHttpRequestExecuter;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheStatus;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public class OcServices
{
   static final String CONSUMER_KEY = "f8k87aHFAVaCn5K9gAeM";
   static final String CONSUMER_SECRET = "ahURUXEUcUbhSmgPmPmMBmePgQNqfT2g2MXLBtxD";

   OcSite ocSite = OcSite.DE;

   public OcServices()
   {
      super();
   }

   OcServices(OcSite anOcSite)
   {
      super();
      ocSite = anOcSite;
   }

   public GeocacheStatus getGeocacheStatus(GeocacheCode aGeocacheCode)
   {
      QueryParameters parameters = new QueryParameters();
      parameters.put("cache_code", aGeocacheCode.getValue());
      parameters.put("fields", "code|status|last_modified");

      String result = callOcService(ocSite, OcMethod.Geocache, parameters);

      throw new UnsupportedOperationException("Not supported yet.");
   }

   String callOcService(OcSite anOcSite, OcMethod anOcMethod, QueryParameters someParameters)
   {
      String url = getUrl(anOcMethod, someParameters);
      System.out.println(url);
      String response = new SimpleHttpRequestExecuter().getResponse(url);
      System.out.println(response);
      return response;
   }

   String getUrl(OcMethod anOcMethod, QueryParameters someParameters)
   {
      QueryParameters queryParameters = new QueryParameters(someParameters);

      if (anOcMethod.getAuthenticationLevel() == AuthenticationLevel.Level1)
      {
         queryParameters.put("consumer_key", CONSUMER_KEY);
      }
      return ocSite.getOkapiUrl() + anOcMethod.getMethodName() + queryParameters.toString();
   }
}
