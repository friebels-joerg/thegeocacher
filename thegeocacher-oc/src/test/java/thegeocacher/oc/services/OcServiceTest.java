package thegeocacher.oc.services;

import org.junit.Assert;
import org.junit.Test;

public class OcServiceTest
{
	@Test
	public void testGetUrl()
	{
		QueryParameters someQueryParameters = new QueryParameters();
		someQueryParameters.put("cache_code", "OC0ED1");
		OcService serviceUnderTest = new OcServiceImpl();
		String expResult = "http://www.opencaching.de/okapi/services/caches/geocache?consumer_key=f8k87aHFAVaCn5K9gAeM&cache_code=OC0ED1";
		String result = serviceUnderTest.getUrl(someQueryParameters);
		Assert.assertEquals(expResult, result);
	}

	public class OcServiceImpl extends OcService
	{
		@Override
		public AuthenticationLevel getAuthenticationLevel()
		{
			return AuthenticationLevel.Level1;
		}

		@Override
		public String getMethodName()
		{
			return "services/caches/geocache";
		}
	}

}
