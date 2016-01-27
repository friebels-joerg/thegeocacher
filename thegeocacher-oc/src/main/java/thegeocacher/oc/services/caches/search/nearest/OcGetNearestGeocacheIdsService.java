package thegeocacher.oc.services.caches.search.nearest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.domain.attribute.Wgs84Coordinates;
import thegeocacher.domain.provider.api.GeocacheIds;
import thegeocacher.domain.provider.api.GetNearestGeocacheIdsService;
import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

/**
 * http://www.opencaching.de/okapi/services/caches/search/nearest?center=
 * 51.22666790215265
 * |6.773414611816406&radius=3&consumer_key=f8k87aHFAVaCn5K9gAeM
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
public class OcGetNearestGeocacheIdsService extends OcService implements GetNearestGeocacheIdsService
{

	public GeocacheIds getGeocacheIds(Wgs84Coordinates aCenter, DistanceInMeter aDistance)
	{
		OcGetNearestGeocacheIdsParameters parameters = new OcGetNearestGeocacheIdsParameters();
		parameters.setRadius(aDistance);
		parameters.setCenter(aCenter);

		String jsonString = callOcService(parameters);
		OcGeocacheCodes jsonObject = getJsonObject(jsonString);
		return getResultObject(jsonObject);
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.CACHES_SEARCH_NEAREST;
	}

	OcGeocacheCodes getJsonObject(String aJsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			OcGeocacheCodes result = mapper.readValue(aJsonString, OcGeocacheCodes.class);
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

	GeocacheIds getResultObject(OcGeocacheCodes aJsonObject)
	{
		GeocacheIds geocacheIds = new GeocacheIds();
		for (String geocacheCode : aJsonObject)
		{
			geocacheIds.add(getGeocacheId(geocacheCode));
		}
		return geocacheIds;
	}
}
