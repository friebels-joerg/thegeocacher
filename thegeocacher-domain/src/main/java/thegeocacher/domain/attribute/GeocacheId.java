package thegeocacher.domain.attribute;

public class GeocacheId
{
	GeocacheCode code;
	GeocacheProvider provider;

	public GeocacheId(GeocacheCode aCode, GeocacheProvider aProvider)
	{
		super();
		code = aCode;
		provider = aProvider;
	}

	public GeocacheCode getCode()
	{
		return code;
	}

	public GeocacheProvider getProvider()
	{
		return provider;
	}
}
