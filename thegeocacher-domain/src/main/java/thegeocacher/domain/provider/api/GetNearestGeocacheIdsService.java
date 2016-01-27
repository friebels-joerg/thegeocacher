package thegeocacher.domain.provider.api;

import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.domain.attribute.Wgs84Coordinates;

/**
 * 
 */
public interface GetNearestGeocacheIdsService
{

	public abstract GeocacheIds getGeocacheIds(Wgs84Coordinates aCenter, DistanceInMeter aDistance);

}