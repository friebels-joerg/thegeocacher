package thegeocacher.oc.services.apisrv.getstats;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetStatsServiceTest
{

	@Test
	public void test()
	{
		GetStatsService serviceUnderTest = new GetStatsService();

		Stats result = serviceUnderTest
				.convertJsonStringToPojo("{\"cache_count\":66739,\"user_count\":70743,\"apps_count\":332,\"apps_active\":67}");

		assertEquals(66739, result.numberOfCaches.intValue());
		assertEquals(70743, result.numberOfActiveUsers.intValue());
		assertEquals(332, result.numberOfApps.intValue());
		assertEquals(67, result.numberOfActiveApps.intValue());
	}

}
