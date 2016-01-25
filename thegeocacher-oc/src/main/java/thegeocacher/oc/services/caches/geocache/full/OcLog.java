package thegeocacher.oc.services.caches.geocache.full;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcLog
{

	@JsonProperty("uuid")
	public String uuid;
	@JsonProperty("cache_code")
	public String cacheCode;
	@JsonProperty("date")
	public String date;
	@JsonProperty("user")
	public OcUser user;
	@JsonProperty("type")
	public String type;
	@JsonProperty("was_recommended")
	public Boolean wasRecommended;
	@JsonProperty("comment")
	public String comment;
	@JsonProperty("images")
	public List<OcImage> images = new ArrayList<OcImage>();
	@JsonProperty("oc_team_entry")
	public Boolean ocTeamEntry;

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
