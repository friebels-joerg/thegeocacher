package thegeocacher.oc.services.users.byusername;

import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

/**
 * http://www.opencaching.de/okapi/services/users/by_username?username=Jon%20
 * Snow&fields=username|uuid&consumer_key=f8k87aHFAVaCn5K9gAeM
 *
 * {"username":"Jon Snow","uuid":"A266282E-3EA9-6FDC-9451-27BD5C67AC65"}
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetUserByUsernameService extends OcService
{
	public OcGetUserByUsernameService()
	{
		super();
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return null;
	}

}
