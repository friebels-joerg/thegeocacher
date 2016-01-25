package thegeocacher.oc.services.caches.geocache.status;

import java.util.Date;

import org.junit.Test;

import thegeocacher.domain.GeocacheStatus;
import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.oc.services.caches.geocache.status.OcGeocacheStatus;
import thegeocacher.oc.services.caches.geocache.status.OcGetGeocacheStatusParameters;
import thegeocacher.oc.services.caches.geocache.status.OcGetGeocacheStatusService;
import static org.junit.Assert.*;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetGeocacheStatusServiceTest
{
	@Test
	public void testGetJsonObject()
	{
		OcGetGeocacheStatusService serviceUnderTest = new OcGetGeocacheStatusService();
		String jsonString = "{\"code\":\"OC1234\",\"status\":\"Available\",\"last_modified\":\"2011-06-13T20:03:32+02:00\"}";

		OcGeocacheStatus result = serviceUnderTest.getJsonObject(jsonString);

		assertEquals("OC1234", result.getCode());
		assertEquals("Available", result.getStatus());
		assertEquals(new Date(111, 05, 13, 20, 03, 32), result.getLastModified());
	}

	@Test
	public void testGetGeocacheStatus()
	{
		OcGetGeocacheStatusService serviceUnderTest = new OcGetGeocacheStatusService();
		OcGeocacheStatus pojo = new OcGeocacheStatus();
		pojo.code = "OC1234";
		pojo.last_modified = new Date(111, 05, 13, 20, 03, 32);
		pojo.status = "Available";

		GeocacheStatus result = serviceUnderTest.getResultObject(pojo);

		assertEquals("OC1234", result.getCode().getValue());
		assertEquals(GeocacheAvailability.available, result.getAvailability());
		assertEquals(pojo.last_modified, result.getLatestModificationTimestamp().getValue());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetAvailabality()
	{
		OcGetGeocacheStatusService serviceUnderTest = new OcGetGeocacheStatusService();

		assertEquals(GeocacheAvailability.available, serviceUnderTest.getAvailabality("Available"));
		assertEquals(GeocacheAvailability.archived, serviceUnderTest.getAvailabality("Archived"));
		assertEquals(GeocacheAvailability.temporarilyUnavailable,
				serviceUnderTest.getAvailabality("Temporarily unavailable"));

		serviceUnderTest.getAvailabality("Invalid String");
	}

	@Test
	public void testGetUrl()
	{
		OcGetGeocacheStatusService serviceUnderTest = new OcGetGeocacheStatusService();
		OcGetGeocacheStatusParameters parameters = new OcGetGeocacheStatusParameters();

		String result = serviceUnderTest.getUrl(parameters);

		String expected = "http://www.opencaching.de/okapi/services/caches/geocache?fields=code%7Cstatus%7Clast_modified&consumer_key=f8k87aHFAVaCn5K9gAeM";
		assertEquals(expected, result);
	}
}
