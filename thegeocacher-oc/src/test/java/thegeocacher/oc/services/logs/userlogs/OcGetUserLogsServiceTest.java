package thegeocacher.oc.services.logs.userlogs;

import java.util.List;

import org.junit.Test;

import thegeocacher.domain.UserLogs;
import thegeocacher.domain.attribute.base.UuidAttribute;
import static org.junit.Assert.*;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetUserLogsServiceTest
{

	@Test
	public void testGetJsonObject()
	{
		OcGetUserLogsService serviceUnderTest = new OcGetUserLogsService();
		String jsonString = "[{\"uuid\":\"f77aea6a-3270-11e4-a39c-525400e33611\",\"date\":\"2014-09-01T00:00:00+02:00\",\"cache_code\":\"OC11149\",\"type\":\"Found it\",\"comment\":\"<p>Der lag offen im Geb\\u00fcsch.<\\/p>\\n<p>Ich habe ihn jetzt neu versteckt, weiss aber nicht, ob die Stelle nicht verbrannt ist.<\\/p>\"},"
				+ "{\"uuid\":\"c5f15454-3287-11e4-a39c-525400e33611\",\"date\":\"2014-09-01T00:00:00+02:00\",\"cache_code\":\"OC1102B\",\"type\":\"Found it\",\"comment\":\"<p>der war schnell gefunden.<\\/p>\\n<p>Musste nur etwas warten, bis die Muggel weg waren.<\\/p>\\n<p>\\u00a0<\\/p>\\n<p>Vielen Dank f\\u00fcr den Cache<\\/p>\"},"
				+ "{\"uuid\":\"54bf5f96-29be-11e4-a39c-525400e33611\",\"date\":\"2014-08-21T00:00:00+02:00\",\"cache_code\":\"OC11026\",\"type\":\"Found it\",\"comment\":\"<p>Das war ein sehr sch\\u00f6ner Cache in einem sehr sch\\u00f6nen Park.<\\/p>\\n<p>Vielen Dank daf\\u00fcr.<\\/p>\\n<p>Die Gr\\u00f6sse ist f\\u00fcr mich eher ein Small.<\\/p>\"}]";
		List<OcUserLog> result = serviceUnderTest.getJsonObject(jsonString);

	}

	@Test
	public void testGetResultObject()
	{
		OcGetUserLogsService serviceUnderTest = new OcGetUserLogsService();
		String jsonString = "[{\"uuid\":\"f77aea6a-3270-11e4-a39c-525400e33611\",\"date\":\"2014-09-01T00:00:00+02:00\",\"cache_code\":\"OC11149\",\"type\":\"Found it\",\"comment\":\"<p>Der lag offen im Geb\\u00fcsch.<\\/p>\\n<p>Ich habe ihn jetzt neu versteckt, weiss aber nicht, ob die Stelle nicht verbrannt ist.<\\/p>\"},"
				+ "{\"uuid\":\"c5f15454-3287-11e4-a39c-525400e33611\",\"date\":\"2014-09-01T00:00:00+02:00\",\"cache_code\":\"OC1102B\",\"type\":\"Found it\",\"comment\":\"<p>der war schnell gefunden.<\\/p>\\n<p>Musste nur etwas warten, bis die Muggel weg waren.<\\/p>\\n<p>\\u00a0<\\/p>\\n<p>Vielen Dank f\\u00fcr den Cache<\\/p>\"},"
				+ "{\"uuid\":\"54bf5f96-29be-11e4-a39c-525400e33611\",\"date\":\"2014-08-21T00:00:00+02:00\",\"cache_code\":\"OC11026\",\"type\":\"Found it\",\"comment\":\"<p>Das war ein sehr sch\\u00f6ner Cache in einem sehr sch\\u00f6nen Park.<\\/p>\\n<p>Vielen Dank daf\\u00fcr.<\\/p>\\n<p>Die Gr\\u00f6sse ist f\\u00fcr mich eher ein Small.<\\/p>\"}]";

		List<OcUserLog> jsonObjects = serviceUnderTest.getJsonObject(jsonString);

		UserLogs result = serviceUnderTest.getResultObject(jsonObjects);
	}

	@Test
	public void testGetUrl()
	{
		OcGetUserLogsService serviceUnderTest = new OcGetUserLogsService();
		OcGetUserLogsParameters parameters = new OcGetUserLogsParameters();
		parameters.setUserUuid(new UuidAttribute("A266282E-3EA9-6FDC-9451-27BD5C67AC65"));

		String result = serviceUnderTest.getUrl(parameters);

		String expected = "http://www.opencaching.de/okapi/services/logs/userlogs?consumer_key=f8k87aHFAVaCn5K9gAeM&user_uuid=A266282E-3EA9-6FDC-9451-27BD5C67AC65";
		assertEquals(expected, result);
	}

}
