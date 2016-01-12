package thegeocacher.oc.services.logs.userlogs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OcGetUserLogsJsonResult
{
	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("date")
	private String date;

	@JsonProperty("cache_code")
	private String cacheCode;

	@JsonProperty("type")
	private String type;

	@JsonProperty("comment")
	private String comment;

}