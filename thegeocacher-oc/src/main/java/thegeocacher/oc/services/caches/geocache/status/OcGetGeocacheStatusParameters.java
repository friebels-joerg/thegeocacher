package thegeocacher.oc.services.caches.geocache.status;

import thegeocacher.domain.attribute.GeocacheId;
import thegeocacher.oc.services.QueryParameters;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcGetGeocacheStatusParameters extends QueryParameters
{

	public OcGetGeocacheStatusParameters()
	{
		super();
		put("fields", "code|status|last_modified");
	}

	public void setGeocacheId(GeocacheId anId)
	{
		put("cache_code", anId.getCode().getValue());
	}

}
