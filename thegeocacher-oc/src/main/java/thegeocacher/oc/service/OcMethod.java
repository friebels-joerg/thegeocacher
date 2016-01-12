package thegeocacher.oc.service;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public enum OcMethod
{
   Geocache("services/caches/geocache", AuthenticationLevel.Level1),
   SearchNearestGeocaches("services/caches/search/nearest", AuthenticationLevel.Level1),
   Installations("services/apisrv/installations", AuthenticationLevel.Level0);

   AuthenticationLevel authenticationLevel;
   String methodName;

   private OcMethod(String aMethodName, AuthenticationLevel anAuthenticationLevel)
   {
      methodName = aMethodName;
      authenticationLevel = anAuthenticationLevel;
   }

   public AuthenticationLevel getAuthenticationLevel()
   {
      return authenticationLevel;
   }

   public String getMethodName()
   {
      return methodName;
   }

}
