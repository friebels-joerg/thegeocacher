package thegeocacher.oc.services;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public enum OcMethod
{
	CACHES_GEOCACHE("services/caches/geocache", AuthenticationLevel.Level1),
	CACHES_SEARCH_NEAREST("services/caches/search/nearest", AuthenticationLevel.Level1),
	LOGS_USERLOGS("services/logs/userlogs", AuthenticationLevel.Level1),
	APISRV_INSTALLATIONS("services/apisrv/installations", AuthenticationLevel.Level0);

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
