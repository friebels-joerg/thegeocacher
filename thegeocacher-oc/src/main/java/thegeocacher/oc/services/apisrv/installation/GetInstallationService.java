package thegeocacher.oc.services.apisrv.installation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetInstallationService {

	public Installation convertJsonStringToPojo(String aString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(aString, Installation.class);
		} catch (JsonParseException e) {
			throw new RuntimeException(e);
		} catch (JsonMappingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
