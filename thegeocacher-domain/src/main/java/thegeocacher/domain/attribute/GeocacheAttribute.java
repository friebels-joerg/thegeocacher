package thegeocacher.domain.attribute;

/**
 *
 * @author Jörg Friebel
 * @since 14.01.2016
 */
public enum GeocacheAttribute
{
	LISTED_AT_OPENCACHING_ONLY("Listed at Opencaching only"),
	NEAR_A_SURVEY_MARKER("Near a Survey Marker"),
	WHERIGO_CACHE("Wherigo Cache"),
	LETTERBOX_CACHE("Letterbox Cache"),
	GEOHOTEL_CACHE("GeoHotel Cache"),
	MAGNETIC_CACHE("Magnetic Cache"),
	DESCRIPTION_CONTAINS_AN_AUDIO_FILE("Description contains an audio file"),
	OFFSET_CACHE("Offset cache"),
	GARMIN_S_WIRELESS_BEACON("Garmin's wireless beacon"),
	DEAD_DROP_USB_CACHE("Dead Drop USB cache"),
	HAS_A_MOVING_TARGET("Has a moving target"),
	A_WEBCAM_IS_INVOLVED("a webcam is involved"),
	OTHER_CACHE_TYPE("Other cache type"),
	INVESTIGATION_REQUIRED("Investigation required"),
	PUZZLE____MYSTERY("Puzzle / Mystery"),
	ARITHMETICAL_PROBLEM("Arithmetical problem"),
	ASK_OWNER_FOR_START_CONDITIONS("Ask owner for start conditions"),
	WHEELCHAIR_ACCESSIBLE("Wheelchair accessible"),
	NEAR_THE_PARKING_AREA("Near the parking area"),
	ACCESS_ONLY_BY_WALK("Access only by walk"),
	LONG_WALK("Long walk"),
	SWAMP__MARSH_OR_WADING("Swamp, marsh or wading"),
	HILLY_AREA("Hilly area"),
	SOME_CLIMBING__NO_GEAR_NEEDED_("Some climbing (no gear needed)"),
	SWIMMING_REQUIRED("Swimming required"),
	ACCESS_OR_PARKING_FEE("Access or parking fee"),
	BIKES_ALLOWED("Bikes allowed"),
	HIDDEN_IN_NATURAL_SURROUNDINGS__FORESTS__MOUNTAINS__ETC__(
	      "Hidden in natural surroundings (forests, mountains, etc.)"),
	HISTORIC_SITE("Historic site"),
	POINT_OF_INTEREST("Point of interest"),
	HIDDEN_WIHIN_ENCLOSED_ROOMS__CAVES__BUILDINGS_ETC__("Hidden wihin enclosed rooms (caves, buildings etc.)"),
	HIDDEN_UNDER_WATER("Hidden under water"),
	PARKING_AREA_NEARBY("Parking area nearby"),
	PUBLIC_TRANSPORTATION("Public transportation"),
	DRINKING_WATER_NEARBY("Drinking water nearby"),
	PUBLIC_RESTROOMS_NEARBY("Public restrooms nearby"),
	PUBLIC_PHONE_NEARBY("Public phone nearby"),
	FIRST_AID_AVAILABLE("First aid available"),
	AVAILABLE_24__7("Available 24/7"),
	NOT_24__7("Not 24/7"),
	NOT_RECOMMENDED_AT_NIGHT("Not recommended at night"),
	RECOMMENDED_AT_NIGHT("Recommended at night"),
	ONLY_AT_NIGHT("Only at night"),
	ALL_SEASONS("All seasons"),
	ONLY_AVAILABLE_DURING_SPECIFIED_SEASONS("Only available during specified seasons"),
	BREEDING_SEASON____PROTECTED_NATURE("Breeding season / protected nature"),
	AVAILABLE_DURING_WINTER("Available during winter"),
	NOT_AT_HIGH_WATER_LEVEL("Not at high water level"),
	COMPASS_REQUIRED("Compass required"),
	TAKE_SOMETHING_TO_WRITE("Take something to write"),
	YOU_MAY_NEED_A_SHOVEL("You may need a shovel"),
	FLASHLIGHT_REQUIRED("Flashlight required"),
	CLIMBING_GEAR_REQUIRED("Climbing gear required"),
	CAVE_EQUIPMENT_REQUIRED("Cave equipment required"),
	DIVING_EQUIPMENT_REQUIRED("Diving equipment required"),
	SPECIAL_TOOLS_REQUIRED("Special tools required"),
	REQUIRES_A_BOAT("Requires a boat"),
	NO_GPS_REQUIRED("No GPS required"),
	DANGEROUS_AREA("Dangerous area"),
	ACTIVE_RAILWAY_NEARBY("Active railway nearby"),
	CLIFF____ROCKS("Cliff / Rocks"),
	HUNTING_GROUNDS("Hunting grounds"),
	LOOK_OUT_FOR_THORNS("Look out for thorns"),
	LOOK_OUT_FOR_TICKS("Look out for ticks"),
	ABANDONED_MINES("Abandoned mines"),
	POISONOUS_PLANTS("Poisonous plants"),
	DANGEROUS_ANIMALS("Dangerous animals"),
	QUICK_CACHE("Quick cache"),
	OVERNIGHT_STAY_NECESSARY("Overnight stay necessary"),
	TAKE_YOUR_CHILDREN("Take your children"),
	SUITED_FOR_CHILDREN__10_12_YO_("Suited for children (10-12 yo)"),
	REVERSE_CACHE("Reverse Cache"),
	AVAILABLE_AT_SPECIFIED_HOURS__MAY_REQUIRE_ACCESS_FEE_("Available at specified hours (may require access fee)"),
	STEALTH_REQUIRED("Stealth required");

	private String description;

	GeocacheAttribute(String aDescription)
	{
		description = aDescription;
	}

	public String getDescription()
	{
		return description;
	}
}
