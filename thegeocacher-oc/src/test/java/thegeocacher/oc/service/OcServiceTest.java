package thegeocacher.oc.service;

import org.junit.Assert;
import org.junit.Test;

import thegeocacher.oc.service.AuthenticationLevel;
import thegeocacher.oc.service.OcService;
import thegeocacher.oc.service.QueryParameters;

public class OcServiceTest
{
	@Test
	public void testGetUrlWithLevel0()
	{
		QueryParameters someQueryParameters = new QueryParameters();
		someQueryParameters.put("parameter0", "value0");
		OcService serviceUnderTest = new OcServiceLevel0Impl();
		String expectedResult = "http://www.opencaching.de/okapi/level0?parameter0=value0";
		String result = serviceUnderTest.getUrl(someQueryParameters);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testGetUrlWithLevel1()
	{
		QueryParameters someQueryParameters = new QueryParameters();
		someQueryParameters.put("parameter1", "value1");
		OcService serviceUnderTest = new OcServiceLevel1Impl();
		String expectedResult = "http://www.opencaching.de/okapi/level1?consumer_key=f8k87aHFAVaCn5K9gAeM&parameter1=value1";
		String result = serviceUnderTest.getUrl(someQueryParameters);
		Assert.assertEquals(expectedResult, result);
	}

	public class OcServiceLevel0Impl extends OcService
	{
		@Override
		public AuthenticationLevel getAuthenticationLevel()
		{
			return AuthenticationLevel.Level0;
		}

		@Override
		public String getMethodName()
		{
			return "level0";
		}
	}

	public class OcServiceLevel1Impl extends OcService
	{
		@Override
		public AuthenticationLevel getAuthenticationLevel()
		{
			return AuthenticationLevel.Level1;
		}

		@Override
		public String getMethodName()
		{
			return "level1";
		}
	}
}