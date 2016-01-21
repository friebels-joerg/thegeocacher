package thegeocacher.ejb.importer;

import thegeocacher.domain.attribute.ProviderImportConfigurationName;
import java.io.Serializable;
import java.util.List;
import thegeocacher.domain.attribute.DistanceInMeter;
import thegeocacher.domain.attribute.GeocacheProvider;
import thegeocacher.domain.attribute.Wgs84Coordinates;

/**
 *
 * @author Jörg Friebel
 * @since 18.01.2016
 */
class ProviderImportConfiguration implements Serializable
{
   ProviderImportConfigurationName name;
   Wgs84Coordinates center;
   DistanceInMeter distance;
   List<GeocacheProvider> providers;
}
