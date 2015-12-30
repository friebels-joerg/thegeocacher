package thegeocacher.oc.services.caches.geocache;

import thegeocacher.oc.services.AuthenticationLevel;
import thegeocacher.oc.services.OcService;

public class GetGeocacheService extends OcService
{

	@Override
	protected AuthenticationLevel getAuthenticationLevel()
	{
		return AuthenticationLevel.Level1;
	}

	@Override
	protected String getMethodName()
	{
		return "services/caches/geocache";
	}

}
