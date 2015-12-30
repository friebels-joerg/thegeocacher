package thegeocacher.oc.services.apisrv.installations;

import java.io.IOException;
import java.util.List;

import thegeocacher.oc.services.AuthenticationLevel;
import thegeocacher.oc.services.OcService;
import thegeocacher.oc.services.apisrv.installation.Installation;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetInstallationsService extends OcService
{

	public Installations convertJsonStringToPojo(String aString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			List<Installation> installations = mapper.readValue(aString, new TypeReference<List<Installation>>()
			{
				//
			});

			return new Installations(installations);
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
		return "services/apisrv/installations";
	}
}
