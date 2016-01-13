package thegeocacher.oc.services.caches.geocache.full;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OcLatestLog
{

	@JsonProperty("uuid")
	public String uuid;
	@JsonProperty("date")
	public String date;
	@JsonProperty("user")
	public OcUser user;
	@JsonProperty("type")
	public String type;
	@JsonProperty("comment")
	public String comment;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties()
	{
		return additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value)
	{
		additionalProperties.put(name, value);
	}

}
