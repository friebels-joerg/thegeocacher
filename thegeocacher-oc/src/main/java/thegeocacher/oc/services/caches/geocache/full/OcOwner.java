package thegeocacher.oc.services.caches.geocache.full;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OcOwner
{

	@JsonProperty("uuid")
	public String uuid;
	@JsonProperty("username")
	public String username;
	@JsonProperty("profile_url")
	public String profileUrl;
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
