package thegeocacher.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import thegeocacher.domain.attribute.GeocacheCode;

/**
 * @author Jörg Friebel
 * @since 29.12.2015
 */
public class Geocache implements Serializable
{

	public GeocacheCode code;

	List<GeocacheName> names = new ArrayList<GeocacheName>();

	// public String location;
	// public String type;
	// public String status;
	// public Object gcCode;
	// public Integer founds;
	// public Integer notfounds;
	// public Integer willattends;
	// public String size2;
	// public Integer difficulty;
	// public Integer terrain;
	// public Object tripTime;
	// public Object tripDistance;
	// public Object rating;
	// public Integer ratingVotes;
	// public Integer recommendations;
	// public Boolean reqPasswd;
	// public Date lastFound;
	// public Date lastModified;
	// public Date dateCreated;
	// public Date dateHidden;
	// public OcOwner owner;
	// public Boolean isFound;
	// public Boolean isNotFound;
	// public OcLanguageTexts shortDescriptions;
	// public OcLanguageTexts descriptions;
	// public OcLanguageTexts hints2;
	// public List<OcImage> images = new ArrayList<OcImage>();
	// public OcPreviewImage previewImage;
	// public List<String> attrAcodes = new ArrayList<String>();
	// public List<OcLog> latestLogs = new ArrayList<OcLog>();
	// public List<OcTrackable> trackables = new ArrayList<OcTrackable>();
	// public Integer trackablesCount;
	// public List<OcAltWpt> altWpts = new ArrayList<OcAltWpt>();
	// public String country;
	// public String state;
	// public List<OcProtectionArea> protectionAreas = new
	// ArrayList<OcProtectionArea>();

	public GeocacheCode getCode()
	{
		return code;
	}

	public void setCode(GeocacheCode aCode)
	{
		code = aCode;
	}

	public List<GeocacheName> getNames()
	{
		return names;
	}

	public void addName(GeocacheName aName)
	{
		names.add(aName);
	}

}
