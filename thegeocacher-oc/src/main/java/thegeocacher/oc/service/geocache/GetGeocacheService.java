package thegeocacher.oc.service.geocache;

import thegeocacher.oc.service.AuthenticationLevel;
import thegeocacher.oc.service.OcService;

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
