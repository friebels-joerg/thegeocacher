package thegeocacher.oc.services.apisrv.getstats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats
{

	@JsonProperty(value = "cache_count")
	Integer numberOfCaches;
	@JsonProperty(value = "user_count")
	Integer numberOfActiveUsers;
	@JsonProperty(value = "apps_count")
	Integer numberOfApps;
	@JsonProperty(value = "apps_active")
	Integer numberOfActiveApps;

}