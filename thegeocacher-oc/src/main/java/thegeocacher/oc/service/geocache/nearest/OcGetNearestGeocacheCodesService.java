package thegeocacher.oc.service.geocache.nearest;

import java.io.IOException;

import thegeocacher.domain.GeocacheCodes;
import thegeocacher.domain.Wgs84Coordinates;
import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.oc.service.OcMethod;
import thegeocacher.oc.service.OcService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
public class OcGetNearestGeocacheCodesService extends OcService
{
	public OcGetNearestGeocacheCodesService()
	{
		super();
	}

	public GeocacheCodes getGeocacheCodes(Wgs84Coordinates aCenter, DistanceInMeter aDistance)
	{
		OcGetNearestGeocacheCodesParameters parameters = new OcGetNearestGeocacheCodesParameters();
		parameters.setRadius(aDistance);
		parameters.setCenter(aCenter);

		String jsonString = callOcService(parameters);
		OcGetNearestGeocacheCodesJsonResult jsonObject = getJsonObject(jsonString);
		return getGeocacheCodes(jsonObject);
	}

	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.SearchNearestGeocaches;
	}

	OcGetNearestGeocacheCodesJsonResult getJsonObject(String aJsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			OcGetNearestGeocacheCodesJsonResult result = mapper.readValue(aJsonString,
					OcGetNearestGeocacheCodesJsonResult.class);
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

	GeocacheCodes getGeocacheCodes(OcGetNearestGeocacheCodesJsonResult aJsonObject)
	{
		GeocacheCodes geocacheCodes = new GeocacheCodes();
		for (String geocacheCode : aJsonObject)
		{
			geocacheCodes.add(new GeocacheCode(geocacheCode));
		}
		return geocacheCodes;
	}
}
