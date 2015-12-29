package thegeocacher.oc.services.apisrv.getstats;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * http://www.opencaching.de/okapi/services/apisrv/getstats
 */
public class GetStatsService {

	String okapiBaseUrl = "http://www.opencaching.de/okapi/";
	String methodName = "services/apisrv/getstats";

	/**
	 * @see #okapiBaseUrl
	 */
	public String getOkapiBaseUrl() {
		return okapiBaseUrl;
	}

	public Stats convertJsonStringToPojo(String aString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(aString, Stats.class);
		} catch (JsonParseException e) {
			throw new RuntimeException(e);
		} catch (JsonMappingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}