package thegeocacher.oc.services.caches.geocache.full;

import thegeocacher.oc.services.QueryParameters;

public class OcGetGeocacheFullParameters extends QueryParameters
{

	private static final String CACHE_CODE = "cache_code";

	public OcGetGeocacheFullParameters()
	{
		super();
	}

	public String getCache_code()
	{
		return get(CACHE_CODE);
	}

	public void setCache_code(String aCache_code)
	{
		put(CACHE_CODE, aCache_code);
	}
}