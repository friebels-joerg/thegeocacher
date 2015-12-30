package thegeocacher.oc.services.apisrv.installations;

import org.junit.Test;

import thegeocacher.oc.services.apisrv.installation.Installation;
import static org.junit.Assert.*;

public class GetInstallationsServiceTest
{

	@Test
	public void test()
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
			assertNotNull(installation.getOkapi_base_url());
			assertNotNull(installation.getSite_name());
			assertNotNull(installation.getSite_url());
		}
	}
}
