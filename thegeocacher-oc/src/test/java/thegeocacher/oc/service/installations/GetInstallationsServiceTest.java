package thegeocacher.oc.service.installations;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetInstallationsServiceTest
{

	@Test
	public void testConvertJsonStringToPojo()
	{
		GetInstallationsService serviceUnderTest = new GetInstallationsService();

		Installations result = serviceUnderTest
				.convertJsonStringToPojo("["
						+ "{\"site_url\":\"http:\\/\\/opencaching.pl\\/\",\"site_name\":\"Opencaching.PL\",\"okapi_base_url\":\"http:\\/\\/opencaching.pl\\/okapi\\/\"},"
						+ "{\"site_url\":\"http:\\/\\/www.opencaching.de\\/\",\"site_name\":\"Opencaching.DE\",\"okapi_base_url\":\"http:\\/\\/www.opencaching.de\\/okapi\\/\"},"
						+ "{\"site_url\":\"http:\\/\\/www.opencaching.us\\/\",\"site_name\":\"Opencaching.US\",\"okapi_base_url\":\"http:\\/\\/www.opencaching.us\\/okapi\\/\"},"
						+ "{\"site_url\":\"http:\\/\\/www.opencaching.nl\\/\",\"site_name\":\"Opencaching.NL\",\"okapi_base_url\":\"http:\\/\\/www.opencaching.nl\\/okapi\\/\"},"
						+ "{\"site_url\":\"http:\\/\\/www.opencaching.ro\\/\",\"site_name\":\"Opencaching.RO\",\"okapi_base_url\":\"http:\\/\\/www.opencaching.ro\\/okapi\\/\"}"
						+ "]");

		assertEquals(5, result.size());

		for (Installation installation : result)
		{
			assertNotNull(installation.okapiBaseUrl);
			assertNotNull(installation.siteName);
			assertNotNull(installation.siteUrl);
		}
	}

	@Test
	public void testGetContent()
	{
		GetInstallationsService serviceUnderTest = new GetInstallationsService();

		String result = serviceUnderTest.getContent();
		assertNotNull(result);
	}

}
