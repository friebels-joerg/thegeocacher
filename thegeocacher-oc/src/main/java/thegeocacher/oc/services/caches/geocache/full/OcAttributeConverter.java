package thegeocacher.oc.services.caches.geocache.full;

import java.util.HashMap;
import java.util.Map;

import thegeocacher.domain.attribute.GeocacheAttribute;

/**
 *
 * @author Jörg Friebel
 * @since 14.01.2016
 */
public class OcAttributeConverter
{
	Map<String, GeocacheAttribute> values;

	public Map<String, GeocacheAttribute> getValues()
	{
		if (values == null)
		{
			initValues();
		}
		return values;
	}

	private void initValues()
	{
		values = new HashMap<String, GeocacheAttribute>();
		values.put("A1", GeocacheAttribute.LISTED_AT_OPENCACHING_ONLY);
		values.put("A2", GeocacheAttribute.NEAR_A_SURVEY_MARKER);
		values.put("A3", GeocacheAttribute.WHERIGO_CACHE);
		values.put("A4", GeocacheAttribute.LETTERBOX_CACHE);
		values.put("A5", GeocacheAttribute.GEOHOTEL_CACHE);
		values.put("A6", GeocacheAttribute.MAGNETIC_CACHE);
		values.put("A7", GeocacheAttribute.DESCRIPTION_CONTAINS_AN_AUDIO_FILE);
		values.put("A8", GeocacheAttribute.OFFSET_CACHE);
		values.put("A9", GeocacheAttribute.GARMIN_S_WIRELESS_BEACON);
		values.put("A10", GeocacheAttribute.DEAD_DROP_USB_CACHE);
		values.put("A11", GeocacheAttribute.HAS_A_MOVING_TARGET);
		values.put("A12", GeocacheAttribute.A_WEBCAM_IS_INVOLVED);
		values.put("A13", GeocacheAttribute.OTHER_CACHE_TYPE);
		values.put("A14", GeocacheAttribute.INVESTIGATION_REQUIRED);
		values.put("A15", GeocacheAttribute.PUZZLE____MYSTERY);
		values.put("A16", GeocacheAttribute.ARITHMETICAL_PROBLEM);
		values.put("A17", GeocacheAttribute.ASK_OWNER_FOR_START_CONDITIONS);
		values.put("A18", GeocacheAttribute.WHEELCHAIR_ACCESSIBLE);
		values.put("A19", GeocacheAttribute.NEAR_THE_PARKING_AREA);
		values.put("A20", GeocacheAttribute.ACCESS_ONLY_BY_WALK);
		values.put("A21", GeocacheAttribute.LONG_WALK);
		values.put("A22", GeocacheAttribute.SWAMP__MARSH_OR_WADING);
		values.put("A23", GeocacheAttribute.HILLY_AREA);
		values.put("A24", GeocacheAttribute.SOME_CLIMBING__NO_GEAR_NEEDED_);
		values.put("A25", GeocacheAttribute.SWIMMING_REQUIRED);
		values.put("A26", GeocacheAttribute.ACCESS_OR_PARKING_FEE);
		values.put("A27", GeocacheAttribute.BIKES_ALLOWED);
		values.put("A28", GeocacheAttribute.HIDDEN_IN_NATURAL_SURROUNDINGS__FORESTS__MOUNTAINS__ETC__);
		values.put("A29", GeocacheAttribute.HISTORIC_SITE);
		values.put("A30", GeocacheAttribute.POINT_OF_INTEREST);
		values.put("A31", GeocacheAttribute.HIDDEN_WIHIN_ENCLOSED_ROOMS__CAVES__BUILDINGS_ETC__);
		values.put("A32", GeocacheAttribute.HIDDEN_UNDER_WATER);
		values.put("A33", GeocacheAttribute.PARKING_AREA_NEARBY);
		values.put("A34", GeocacheAttribute.PUBLIC_TRANSPORTATION);
		values.put("A35", GeocacheAttribute.DRINKING_WATER_NEARBY);
		values.put("A36", GeocacheAttribute.PUBLIC_RESTROOMS_NEARBY);
		values.put("A37", GeocacheAttribute.PUBLIC_PHONE_NEARBY);
		values.put("A38", GeocacheAttribute.FIRST_AID_AVAILABLE);
		values.put("A39", GeocacheAttribute.AVAILABLE_24__7);
		values.put("A40", GeocacheAttribute.NOT_24__7);
		values.put("A41", GeocacheAttribute.NOT_RECOMMENDED_AT_NIGHT);
		values.put("A42", GeocacheAttribute.RECOMMENDED_AT_NIGHT);
		values.put("A43", GeocacheAttribute.ONLY_AT_NIGHT);
		values.put("A44", GeocacheAttribute.ALL_SEASONS);
		values.put("A45", GeocacheAttribute.ONLY_AVAILABLE_DURING_SPECIFIED_SEASONS);
		values.put("A46", GeocacheAttribute.BREEDING_SEASON____PROTECTED_NATURE);
		values.put("A47", GeocacheAttribute.AVAILABLE_DURING_WINTER);
		values.put("A48", GeocacheAttribute.NOT_AT_HIGH_WATER_LEVEL);
		values.put("A49", GeocacheAttribute.COMPASS_REQUIRED);
		values.put("A50", GeocacheAttribute.TAKE_SOMETHING_TO_WRITE);
		values.put("A51", GeocacheAttribute.YOU_MAY_NEED_A_SHOVEL);
		values.put("A52", GeocacheAttribute.FLASHLIGHT_REQUIRED);
		values.put("A53", GeocacheAttribute.CLIMBING_GEAR_REQUIRED);
		values.put("A54", GeocacheAttribute.CAVE_EQUIPMENT_REQUIRED);
		values.put("A55", GeocacheAttribute.DIVING_EQUIPMENT_REQUIRED);
		values.put("A56", GeocacheAttribute.SPECIAL_TOOLS_REQUIRED);
		values.put("A57", GeocacheAttribute.REQUIRES_A_BOAT);
		values.put("A58", GeocacheAttribute.NO_GPS_REQUIRED);
		values.put("A59", GeocacheAttribute.DANGEROUS_AREA);
		values.put("A60", GeocacheAttribute.ACTIVE_RAILWAY_NEARBY);
		values.put("A61", GeocacheAttribute.CLIFF____ROCKS);
		values.put("A62", GeocacheAttribute.HUNTING_GROUNDS);
		values.put("A63", GeocacheAttribute.LOOK_OUT_FOR_THORNS);
		values.put("A64", GeocacheAttribute.LOOK_OUT_FOR_TICKS);
		values.put("A65", GeocacheAttribute.ABANDONED_MINES);
		values.put("A66", GeocacheAttribute.POISONOUS_PLANTS);
		values.put("A67", GeocacheAttribute.DANGEROUS_ANIMALS);
		values.put("A68", GeocacheAttribute.QUICK_CACHE);
		values.put("A69", GeocacheAttribute.OVERNIGHT_STAY_NECESSARY);
		values.put("A70", GeocacheAttribute.TAKE_YOUR_CHILDREN);
		values.put("A71", GeocacheAttribute.SUITED_FOR_CHILDREN__10_12_YO_);
		values.put("A72", GeocacheAttribute.REVERSE_CACHE);
		values.put("A73", GeocacheAttribute.AVAILABLE_AT_SPECIFIED_HOURS__MAY_REQUIRE_ACCESS_FEE_);
		values.put("A74", GeocacheAttribute.STEALTH_REQUIRED);
	}

	GeocacheAttribute getAttribute(String aAttributeString)
	{
		return getValues().get(aAttributeString);
	}
}