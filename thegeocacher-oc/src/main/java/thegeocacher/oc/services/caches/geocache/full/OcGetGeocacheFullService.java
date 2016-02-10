package thegeocacher.oc.services.caches.geocache.full;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcGetGeocacheFullService extends OcService
{
	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.CACHES_GEOCACHE;
	}

	public OcGeocacheFull getJsonObject(String aJsonString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			OcGeocacheFull fullGeocache = mapper.readValue(aJsonString, OcGeocacheFull.class);
			return fullGeocache;
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
}
