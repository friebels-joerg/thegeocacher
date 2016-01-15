package thegeocacher.domain.attribute;

import java.io.Serializable;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class Wgs84Coordinates implements Serializable
{
	Wgs84Latitude latitude;
	Wgs84Longitude longitude;

	public Wgs84Latitude getLatitude()
	{
		return latitude;
	}

	public void setLatitude(Wgs84Latitude aLatitude)
	{
		latitude = aLatitude;
	}

	public Wgs84Longitude getLongitude()
	{
		return longitude;
	}

	public void setLongitude(Wgs84Longitude aLongitude)
	{
		longitude = aLongitude;
	}
}
