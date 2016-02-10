package thegeocacher.oc.services.caches.geocache.status;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.domain.attribute.GeocacheId;
import thegeocacher.domain.attribute.UpdateTimestamp;
import thegeocacher.domain.provider.api.GeocacheStatus;
import thegeocacher.domain.provider.api.GetGeocacheStatusService;
import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public class OcGetGeocacheStatusService extends OcService implements GetGeocacheStatusService
{
	public OcGetGeocacheStatusService()
	{
		super();
	}

	public GeocacheStatus getProvidersGeocacheStatus(GeocacheId aGeocacheId)
	{
		OcGetGeocacheStatusParameters parameters = new OcGetGeocacheStatusParameters();
		parameters.setGeocacheId(aGeocacheId);

		String jsonString = callOcService(parameters);
		OcGeocacheStatus jsonObject = getJsonObject(jsonString);
		GeocacheStatus geocacheStatus = getResultObject(jsonObject);
		return geocacheStatus;
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.CACHES_GEOCACHE;
	}

	OcGeocacheStatus getJsonObject(String aJsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			OcGeocacheStatus result = mapper.readValue(aJsonString, OcGeocacheStatus.class);
			return result;
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

	GeocacheStatus getResultObject(OcGeocacheStatus aJsonObject)
	{
		GeocacheStatus status = new GeocacheStatus();
		status.setAvailability(getAvailabality(aJsonObject.getStatus()));
		status.setId(getGeocacheId(aJsonObject.getCode()));
		status.setLatestModificationTimestamp(new UpdateTimestamp(aJsonObject.getLastModified()));
		return status;
	}

	GeocacheAvailability getAvailabality(String aStatus)
	{
		if ("Available".equals(aStatus))
		{
			return GeocacheAvailability.AVAILABLE;
		}
		if ("Temporarily unavailable".equals(aStatus))
		{
			return GeocacheAvailability.TEMPORARILY_UNAVAILABLE;
		}
		if ("Archived".equals(aStatus))
		{
			return GeocacheAvailability.ARCHIVED;
		}

		throw new IllegalArgumentException("Cannot convert " + aStatus + " to a GeocacheAvailability");
	}
}
