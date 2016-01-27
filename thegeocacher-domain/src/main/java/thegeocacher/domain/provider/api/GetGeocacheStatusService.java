package thegeocacher.domain.provider.api;

import thegeocacher.domain.attribute.GeocacheId;

public interface GetGeocacheStatusService
{
	GeocacheStatus getProvidersGeocacheStatus(GeocacheId aGeocacheId);
}
