package thegeocacher.oc.services.logs.userlogs;

import java.io.IOException;
import java.util.List;

import thegeocacher.domain.Log;
import thegeocacher.domain.Logs;
import thegeocacher.domain.attribute.base.UuidAttribute;
import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * http://www.opencaching.de/okapi/services/logs/userlogs?user_uuid=A266282E-
 * 3EA9-6FDC-9451-27BD5C67AC65&consumer_key=f8k87aHFAVaCn5K9gAeM
 *
 * {"results":["OC1294E","OC110EE","OC217F","OC120B1","OC10C06","OC9F2D",
 * "OCC2CC","OCF33C","OC10245","OC1125C","OC10640","OC3441","OC11518","OC11AAB",
 * "OC12373"
 * ,"OC127E9","OC116EF","OC127E6","OC1102E","OC127E7","OC11031","OC1102F"
 * ,"OC111B1"],"more":false}
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetUserLogsService extends OcService
{
	public OcGetUserLogsService()
	{
		super();
	}

	public Logs getLogs(UuidAttribute aUserUuid)
	{
		OcGetUserLogsParameters parameters = new OcGetUserLogsParameters();
		parameters.setUserUuid(aUserUuid);

		String jsonString = callOcService(parameters);
		List<OcGetUserLogsJsonResult> jsonObjects = getJsonObject(jsonString);
		return getResultObject(jsonObjects);
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.LOGS_USERLOGS;
	}

	List<OcGetUserLogsJsonResult> getJsonObject(String aJsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.readValue(aJsonString, new TypeReference<List<OcGetUserLogsJsonResult>>()
			{});
		}
		catch (JsonParseException e)
		{
			throw new RuntimeException(e);
		}
		catch (JsonMappingException e)
		{
			throw new RuntimeException(e);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	Logs getResultObject(List<OcGetUserLogsJsonResult> someJsonObject)
	{
		Logs logs = new Logs();
		for (OcGetUserLogsJsonResult log : someJsonObject)
		{
			logs.add(getLog(log));
		}
		return logs;
	}

	private Log getLog(OcGetUserLogsJsonResult aLog)
	{
		// // TODO dt0a19, 12.01.2016: implements
		return new Log();
	}
}
