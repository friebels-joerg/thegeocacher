package thegeocacher.oc.service.installations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Installation
{
	@JsonProperty(value = "site_url")
	String siteUrl;
	@JsonProperty(value = "site_name")
	String siteName;
	@JsonProperty(value = "okapi_base_url")
	String okapiBaseUrl;

}