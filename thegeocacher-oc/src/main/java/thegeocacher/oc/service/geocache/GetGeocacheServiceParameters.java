package thegeocacher.oc.service.geocache;

import thegeocacher.oc.service.QueryParameters;

public class GetGeocacheServiceParameters extends QueryParameters
{

	private static final String CACHE_CODE = "cache_code";

	public GetGeocacheServiceParameters()
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