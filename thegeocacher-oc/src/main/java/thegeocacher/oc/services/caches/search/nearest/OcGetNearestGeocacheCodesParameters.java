package thegeocacher.oc.services.caches.search.nearest;

import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.domain.attribute.Wgs84Coordinates;
import thegeocacher.oc.services.QueryParameters;

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
