package thegeocacher.oc.services.caches.geocache.status;

import java.io.IOException;

import thegeocacher.domain.GeocacheStatus;
import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.UpdateTimestamp;
import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

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
		OcGeocacheStatus jsonObject = getJsonObject(jsonString);
		return getResultObject(jsonObject);
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
		GeocacheStatus geocacheStatus = new GeocacheStatus();
		geocacheStatus.setAvailability(getAvailabality(aJsonObject.getStatus()));
		geocacheStatus.setCode(new GeocacheCode(aJsonObject.getCode()));
		geocacheStatus.setLatestModificationTimestamp(new UpdateTimestamp(aJsonObject.getLastModified()));
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
