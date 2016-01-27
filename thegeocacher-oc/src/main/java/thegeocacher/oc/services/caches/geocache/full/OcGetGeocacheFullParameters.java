package thegeocacher.oc.services.caches.geocache.full;

import thegeocacher.domain.attribute.GeocacheId;
import thegeocacher.oc.services.QueryParameters;
import thegeocacher.oc.services.UserUuidSetable;

import thegeocacher.oc.services.UserUuidSetable;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcGetGeocacheFullParameters extends QueryParameters implements UserUuidSetable
{

	private static final String CACHE_CODE = "cache_code";

	public OcGetGeocacheFullParameters()
	{
		super();
		put("fields",
		         "code|names|location|type|status|owner|gc_code|is_found|is_not_found|founds|notfounds|willattends|size2|difficulty|terrain|trip_time|trip_distance|rating|rating_votes|recommendations|req_passwd|short_description|description|hint2|images|preview_image|attr_acodes|latest_logs|trackables_count|trackables|alt_wpts|country|state|protection_areas|last_found|last_modified|date_created|date_hidden");
		put("attribution_append", "none");
		put("log_fields", "uuid|date|user|type|comment|oc_team_entry|was_recommended|cache_code|images");
	}

	public void setCacheCode(GeocacheId aId)
	{
		put(CACHE_CODE, aId.getCode().getValue());
	}
}