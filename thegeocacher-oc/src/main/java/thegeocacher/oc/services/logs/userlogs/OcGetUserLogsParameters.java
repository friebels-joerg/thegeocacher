package thegeocacher.oc.services.logs.userlogs;

import thegeocacher.domain.attribute.base.UuidAttribute;
import thegeocacher.oc.services.QueryParameters;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetUserLogsParameters extends QueryParameters
{

	public void setUserUuid(UuidAttribute aUserUuid)
	{
		put("user_uuid", aUserUuid.getValue());
	}
}