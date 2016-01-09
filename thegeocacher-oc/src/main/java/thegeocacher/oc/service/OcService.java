package thegeocacher.oc.service;

import thegeocacher.common.web.SimpleHttpRequestExecuter;

abstract public class OcService
{
   OcSite ocSite = OcSite.DE;

   abstract protected OcMethod getOcMethod();

   protected OcService()
   {
      super();
   }

   protected OcService(OcSite anOcSite)
   {
      super();
      ocSite = anOcSite;
   }

   String getUrl(QueryParameters someParameters)
   {
      QueryParameters queryParameters = new QueryParameters(someParameters);

      if (getOcMethod().getAuthenticationLevel() == AuthenticationLevel.Level1)
      {
         queryParameters.put("consumer_key", OcProperties.getInstance().getConsumerKey());
      }
      return ocSite.getOkapiUrl() + getOcMethod().getMethodName() + queryParameters.toString();
   }

   protected String callOcService(QueryParameters someParameters)
   {
      String url = getUrl(someParameters);
      System.out.println(url);
      String response = new SimpleHttpRequestExecuter().getResponse(url);
      System.out.println(response);
      return response;
   }

}
