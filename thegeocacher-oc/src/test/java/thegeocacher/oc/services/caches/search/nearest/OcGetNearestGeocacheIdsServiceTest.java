package thegeocacher.oc.services.caches.search.nearest;

import static org.junit.Assert.*;

import org.junit.Test;
import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.domain.attribute.Wgs84Coordinates;
import thegeocacher.domain.attribute.Wgs84Latitude;
import thegeocacher.domain.attribute.Wgs84Longitude;
import thegeocacher.domain.provider.api.GeocacheIds;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetNearestGeocacheIdsServiceTest
{
	@Test
	public void testGetJsonObject()
	{
		OcGetNearestGeocacheIdsService serviceUnderTest = new OcGetNearestGeocacheIdsService();
		String jsonString = "{\"results\":[\"OC1294E\",\"OC110EE\",\"OC217F\",\"OC120B1\",\"OC10C06\",\"OC9F2D\",\"OCC2CC\",\"OCF33C\",\"OC10245\",\"OC1125C\",\"OC10640\",\"OC3441\",\"OC11518\",\"OC11AAB\",\"OC12373\",\"OC127E9\",\"OC116EF\",\"OC127E6\",\"OC1102E\",\"OC127E7\",\"OC11031\",\"OC1102F\",\"OC111B1\"],\"more\":false}";

		OcGeocacheCodes result = serviceUnderTest.getJsonObject(jsonString);

		assertNotNull(result.iterator().next());
		assertFalse(result.getMore());
	}

	@Test
	public void testGetResultObject()
	{
		OcGetNearestGeocacheIdsService serviceUnderTest = new OcGetNearestGeocacheIdsService();
		String jsonString = "{\"results\":[\"OC1294E\",\"OC110EE\",\"OC217F\",\"OC120B1\",\"OC10C06\",\"OC9F2D\",\"OCC2CC\",\"OCF33C\",\"OC10245\",\"OC1125C\",\"OC10640\",\"OC3441\",\"OC11518\",\"OC11AAB\",\"OC12373\",\"OC127E9\",\"OC116EF\",\"OC127E6\",\"OC1102E\",\"OC127E7\",\"OC11031\",\"OC1102F\",\"OC111B1\"],\"more\":false}";

		OcGeocacheCodes jsonObject = serviceUnderTest.getJsonObject(jsonString);

		GeocacheIds result = serviceUnderTest.getResultObject(jsonObject);
	}

	@Test
	public void testGetUrl()
	{
		OcGetNearestGeocacheIdsService serviceUnderTest = new OcGetNearestGeocacheIdsService();
		OcGetNearestGeocacheIdsParameters parameters = new OcGetNearestGeocacheIdsParameters();
		Wgs84Coordinates center = new Wgs84Coordinates();
		center.setLatitude(new Wgs84Latitude(51.22666790215265));
		center.setLongitude(new Wgs84Longitude(6.773414611816406));
		parameters.setCenter(center);
		parameters.setRadius(new DistanceInMeter(3000.0));

		String result = serviceUnderTest.getUrl(parameters);

		String expected = "http://www.opencaching.de/okapi/services/caches/search/nearest?radius=3.0&consumer_key=f8k87aHFAVaCn5K9gAeM&center=51.22666790215265%7C6.773414611816406";
		assertEquals(expected, result);
	}
}
