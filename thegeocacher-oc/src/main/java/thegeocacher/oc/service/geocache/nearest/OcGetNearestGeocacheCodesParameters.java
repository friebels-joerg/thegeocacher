package thegeocacher.oc.service.geocache.nearest;

import thegeocacher.domain.Wgs84Coordinates;
import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.oc.service.QueryParameters;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetNearestGeocacheCodesParameters extends QueryParameters
{

	public void setRadius(DistanceInMeter aDistance)
	{
		put("radius", "" + (aDistance.getValue() / 1000));
	}

	public void setCenter(Wgs84Coordinates aCenter)
	{
		put("center", aCenter.getLatitude().getValue() + "|" + aCenter.getLongitude().getValue());
	}
}
