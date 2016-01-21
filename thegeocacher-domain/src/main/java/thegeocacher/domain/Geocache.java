package thegeocacher.domain;

import java.io.Serializable;

import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheName;
import thegeocacher.domain.attribute.GeocacheNames;
import thegeocacher.domain.attribute.GeocacheType;
import thegeocacher.domain.attribute.Wgs84Coordinates;

/**
 * @author Jörg Friebel
 * @since 29.12.2015
 */
public class Geocache implements Serializable
{
	GeocacheCode code;
	GeocacheNames names;
	Wgs84Coordinates location;
	GeocacheType type;
	GeocacheAvailability availability;
	Links links;

	// Integer founds;
	// Integer notfounds;
	// Integer willattends;
	// String size2;
	// Integer difficulty;
	// Integer terrain;
	// Object tripTime;
	// Object tripDistance;
	// Object rating;
	// Integer ratingVotes;
	// Integer recommendations;
	// Boolean reqPasswd;
	// Date lastFound;
	// Date lastModified;
	// Date dateCreated;
	// Date dateHidden;
	// OcOwner owner;
	// Boolean isFound;
	// Boolean isNotFound;
	// OcLanguageTexts shortDescriptions;
	// OcLanguageTexts descriptions;
	// OcLanguageTexts hints2;
	// List<OcImage> images = new ArrayList<OcImage>();
	// OcPreviewImage previewImage;
	// List<String> attrAcodes = new ArrayList<String>();
	// List<OcLog> latestLogs = new ArrayList<OcLog>();
	// List<OcTrackable> trackables = new ArrayList<OcTrackable>();
	// Integer trackablesCount;
	// List<OcAltWpt> altWpts = new ArrayList<OcAltWpt>();
	// String country;
	// String state;
	// List<OcProtectionArea> protectionAreas = new
	// ArrayList<OcProtectionArea>();

	public GeocacheCode getCode()
	{
		return code;
	}

	public void setCode(GeocacheCode aCode)
	{
		code = aCode;
	}

	public GeocacheNames getNames()
	{
		return names;
	}

	public void addName(GeocacheName aName)
	{
		getNames().add(aName);
	}

	public Wgs84Coordinates getLocation()
	{
		return location;
	}

	public void setLocation(Wgs84Coordinates aLocation)
	{
		location = aLocation;
	}

	public GeocacheType getType()
	{
		return type;
	}

	public void setType(GeocacheType aType)
	{
		type = aType;
	}
}
