package thegeocacher.oc.services.caches.geocache.full;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OcGeocacheFull
{

	@JsonProperty("code")
	public String code;
	@JsonProperty("name")
	public String name;
	@JsonProperty("location")
	public String location;
	@JsonProperty("type")
	public String type;
	@JsonProperty("status")
	public String status;
	@JsonProperty("gc_code")
	public Object gcCode;
	@JsonProperty("founds")
	public Integer founds;
	@JsonProperty("notfounds")
	public Integer notfounds;
	@JsonProperty("willattends")
	public Integer willattends;
	@JsonProperty("size2")
	public String size2;
	@JsonProperty("difficulty")
	public Integer difficulty;
	@JsonProperty("terrain")
	public Integer terrain;
	@JsonProperty("trip_time")
	public Object tripTime;
	@JsonProperty("trip_distance")
	public Object tripDistance;
	@JsonProperty("rating")
	public Object rating;
	@JsonProperty("rating_votes")
	public Integer ratingVotes;
	@JsonProperty("recommendations")
	public Integer recommendations;
	@JsonProperty("req_passwd")
	public Boolean reqPasswd;
	@JsonProperty("last_found")
	public Date lastFound;
	@JsonProperty("last_modified")
	public Date lastModified;
	@JsonProperty("date_created")
	public Date dateCreated;
	@JsonProperty("date_hidden")
	public Date dateHidden;
	@JsonProperty("owner")
	public OcOwner owner;
	@JsonProperty("is_found")
	public Boolean isFound;
	@JsonProperty("is_not_found")
	public Boolean isNotFound;
	@JsonProperty("short_description")
	public String shortDescription;
	@JsonProperty("description")
	public String description;
	@JsonProperty("hint2")
	public String hint2;
	@JsonProperty("images")
	public List<OcImage> images = new ArrayList<OcImage>();
	@JsonProperty("preview_image")
	public OcPreviewImage previewImage;
	@JsonProperty("attr_acodes")
	public List<String> attrAcodes = new ArrayList<String>();
	@JsonProperty("latest_logs")
	public List<OcLog> latestLogs = new ArrayList<OcLog>();
	@JsonProperty("trackables")
	public List<OcTrackable> trackables = new ArrayList<OcTrackable>();
	@JsonProperty("trackables_count")
	public Integer trackablesCount;
	@JsonProperty("alt_wpts")
	public List<OcAltWpt> altWpts = new ArrayList<OcAltWpt>();
	@JsonProperty("country")
	public String country;
	@JsonProperty("state")
	public String state;
	@JsonProperty("protection_areas")
	public List<OcProtectionArea> protectionAreas = new ArrayList<OcProtectionArea>();
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
