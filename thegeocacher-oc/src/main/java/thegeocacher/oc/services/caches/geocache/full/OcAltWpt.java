package thegeocacher.oc.services.caches.geocache.full;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OcAltWpt
{

	@JsonProperty("name")
	public String name;
	@JsonProperty("location")
	public String location;
	@JsonProperty("type")
	public String type;
	@JsonProperty("type_name")
	public String typeName;
	@JsonProperty("sym")
	public String sym;
	@JsonProperty("description")
	public String description;
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