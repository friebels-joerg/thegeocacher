package thegeocacher.oc.services.logs.userlogs;

import java.io.IOException;
import java.util.List;

import thegeocacher.domain.UserLog;
import thegeocacher.domain.UserLogs;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.LogText;
import thegeocacher.domain.attribute.LogTimestamp;
import thegeocacher.domain.attribute.LogType;
import thegeocacher.domain.attribute.LogUuid;
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
	int limit = 20;

	public OcGetUserLogsService()
	{
		super();
	}

	/**
	 * @param aCallNumer
	 *            start wit 1 for the first call (aCallNumber-1)*limit will be
	 *            the offset
	 */
	public UserLogs getLogs(UuidAttribute aUserUuid, int aCallNumer)
	{
		if (aCallNumer < 1)
		{
			throw new IllegalArgumentException("aCallnumber must be 1 or higher");
		}
		OcGetUserLogsParameters parameters = new OcGetUserLogsParameters();
		parameters.setUserUuid(aUserUuid);
		parameters.setOffset((aCallNumer - 1) * 20);

		String jsonString = callOcService(parameters);
		List<OcUserLog> jsonObjects = getJsonObject(jsonString);
		return getResultObject(jsonObjects);
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.LOGS_USERLOGS;
	}

	List<OcUserLog> getJsonObject(String aJsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.readValue(aJsonString, new TypeReference<List<OcUserLog>>()
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

	UserLogs getResultObject(List<OcUserLog> someJsonObject)
	{
		UserLogs logs = new UserLogs();
		for (OcUserLog log : someJsonObject)
		{
			logs.add(getLog(log));
		}

		if (someJsonObject.size() == limit)
		{
			logs.setMoreLogsAvailable(Boolean.TRUE);
		}

		return logs;
	}

	private UserLog getLog(OcUserLog aLog)
	{
		UserLog log = new UserLog();
		log.setGeocacheCode(new GeocacheCode(aLog.getCacheCode()));
		log.setText(new LogText(aLog.getComment()));
		log.setTimestamp(new LogTimestamp(aLog.getDate()));
		log.setType(getLogType(aLog.getType()));
		log.setUuid(new LogUuid(aLog.getUuid()));
		return log;
	}

	private LogType getLogType(String aLogTypeString)
	{

		if ("Found it".equals(aLogTypeString))
		{
			return LogType.FOUND_IT;
		}
		if ("Didn't find it".equals(aLogTypeString))
		{
			return LogType.DID_NOT_FIND_IT;
		}
		if ("Comment".equals(aLogTypeString))
		{
			return LogType.COMMENT;
		}
		if ("Will attend".equals(aLogTypeString))
		{
			return LogType.WILL_ATTEND;
		}
		if ("Attended".equals(aLogTypeString))
		{
			return LogType.ATTENDED;
		}
		if ("Temporarily unavailable".equals(aLogTypeString))
		{
			return LogType.TEMPORARILY_UNAVAILABLE;
		}
		if ("Ready to search".equals(aLogTypeString))
		{
			return LogType.READY_TO_SEARCH;
		}
		if ("Archived".equals(aLogTypeString))
		{
			return LogType.ARCHIVED;
		}
		if ("Locked".equals(aLogTypeString))
		{
			return LogType.LOCKED;
		}
		if ("Needs maintenance".equals(aLogTypeString))
		{
			return LogType.NEEDS_MAINTENANCE;
		}
		if ("Maintenance performed".equals(aLogTypeString))
		{
			return LogType.MAINTENANCE_PERFORMED;
		}
		if ("Moved".equals(aLogTypeString))
		{
			return LogType.MOVED;
		}
		if ("OC Team comment".equals(aLogTypeString))
		{
			return LogType.OC_TEAM_COMMENT;
		}

		return LogType.UNKNOWN;
	}

}
