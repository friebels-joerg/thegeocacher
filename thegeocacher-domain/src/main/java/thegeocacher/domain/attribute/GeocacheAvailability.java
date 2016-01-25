package thegeocacher.domain.attribute;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public enum GeocacheAvailability
{
	AVAILABLE, // - Cache is available and ready for search,
	TEMPORARILY_UNAVAILABLE, // - Cache is probably unavailable (i.e. in need of
	                         // maintenance)
	ARCHIVED; // - Cache is permanently unavailable (moved to the archives).
}
