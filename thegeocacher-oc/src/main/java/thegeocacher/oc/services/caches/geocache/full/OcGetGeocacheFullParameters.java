package thegeocacher.oc.services.caches.geocache.full;

import thegeocacher.oc.services.OcProperties;
import thegeocacher.oc.services.QueryParameters;

public class OcGetGeocacheFullParameters extends QueryParameters
{

	private static final String CACHE_CODE = "cache_code";

	public OcGetGeocacheFullParameters()
	{
		super();
		put("fields",
				"code|names|location|type|status|owner|gc_code|is_found|is_not_found|founds|notfounds|willattends|size2|difficulty|terrain|trip_time|trip_distance|rating|rating_votes|recommendations|req_passwd|short_description|description|hint2|images|preview_image|attr_acodes|latest_logs|trackables_count|trackables|alt_wpts|country|state|protection_areas|last_found|last_modified|date_created|date_hidden");
		put("user_uuid", OcProperties.getInstance().getUserUuid());
		put("attribution_append", "none");
		put("log_fields", "uuid|date|user|type|comment|oc_team_entry|was_recommended|cache_code|images");
	}

	public void setCacheCode(String aCache_code)
	{
		put(CACHE_CODE, aCache_code);
	}
}