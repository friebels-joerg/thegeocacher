package thegeocacher.oc.services.caches.geocache;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class GetGeocacheServiceTest {

	@Test
	public void testGteUrl() {
		GetGeocacheService serviceUnderTest = new GetGeocacheService();
		GetGeocacheServiceParameters parameters = new GetGeocacheServiceParameters();
		parameters.setCache_code("OC0ED1");
		String result = serviceUnderTest.getUrl(parameters);
		assertEquals(
				"http://www.opencaching.de/okapi/services/caches/geocache?consumer_key=f8k87aHFAVaCn5K9gAeM&cache_code=OC0ED1",
				result);

	}

}
