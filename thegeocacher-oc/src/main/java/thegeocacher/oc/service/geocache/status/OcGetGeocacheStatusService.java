package thegeocacher.oc.service.geocache.status;

import java.io.IOException;

import thegeocacher.domain.GeocacheStatus;
import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.UpdateTimestamp;
import thegeocacher.oc.service.OcMethod;
import thegeocacher.oc.service.OcService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public class OcGetGeocacheStatusService extends OcService
{
	public OcGetGeocacheStatusService()
	{
		super();
	}

	public GeocacheStatus getGeocacheStatus(GeocacheCode aGeocacheCode)
	{
		OcGetGeocacheStatusParameters parameters = new OcGetGeocacheStatusParameters();
		parameters.setGeocacheCode(aGeocacheCode);

		String jsonString = callOcService(parameters);
		OcGetGeocacheStatusResult result = convertJsonStringToPojo(jsonString);

		GeocacheStatus geocacheStatus = convertPojoToGeocacheStatus(result);

		return geocacheStatus;
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.Geocache;
	}

	OcGetGeocacheStatusResult convertJsonStringToPojo(String aJsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			OcGetGeocacheStatusResult result = mapper.readValue(aJsonString, OcGetGeocacheStatusResult.class);
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

	GeocacheStatus convertPojoToGeocacheStatus(OcGetGeocacheStatusResult result)
	{
		GeocacheStatus geocacheStatus = new GeocacheStatus();
		geocacheStatus.setAvailability(getAvailabality(result.getStatus()));
		geocacheStatus.setCode(new GeocacheCode(result.getCode()));
		geocacheStatus.setLastModified(new UpdateTimestamp(result.getLastModified()));
		return geocacheStatus;
	}

	GeocacheAvailability getAvailabality(String aStatus)
	{
		if ("Available".equals(aStatus))
		{
			return GeocacheAvailability.available;
		}
		if ("Temporarily unavailable".equals(aStatus))
		{
			return GeocacheAvailability.temporarilyUnavailable;
		}
		if ("Archived".equals(aStatus))
		{
			return GeocacheAvailability.archived;
		}

		throw new IllegalArgumentException("Cannot convert " + aStatus + " to a GeocacheAvailability");
	}
}
