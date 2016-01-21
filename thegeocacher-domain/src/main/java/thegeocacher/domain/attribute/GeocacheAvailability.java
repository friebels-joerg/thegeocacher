package thegeocacher.domain.attribute;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public enum GeocacheAvailability
{
   available, // - Cache is available and ready for search,
   temporarilyUnavailable, // - Cache is probably unavailable (i.e. in need of maintenance)
   archived;               // - Cache is permanently unavailable (moved to the archives).
}
