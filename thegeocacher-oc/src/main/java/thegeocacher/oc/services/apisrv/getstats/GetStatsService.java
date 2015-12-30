package thegeocacher.oc.services.apisrv.getstats;

import java.io.IOException;

import thegeocacher.oc.services.AuthenticationLevel;
import thegeocacher.oc.services.OcService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetStatsService extends OcService
{
	public Stats convertJsonStringToPojo(String aString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.readValue(aString, Stats.class);
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

	@Override
	protected AuthenticationLevel getAuthenticationLevel()
	{
		return AuthenticationLevel.Level0;
	}

	@Override
	protected String getMethodName()
	{
		return "services/apisrv/stats";
	}
}