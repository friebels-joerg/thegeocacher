package thegeocacher.oc.services;

/**
 *
 * @author Jörg Friebel
 * @since 01.01.2016
 */
public class OcProperties
{
	static final String OPENCACHING_DE_CONSUMER_KEY = "f8k87aHFAVaCn5K9gAeM";
	static final String OPENCACHING_DE_CONSUMER_SECRET = "ahURUXEUcUbhSmgPmPmMBmePgQNqfT2g2MXLBtxD";

	static final String OPENCACHING_DE_USER_UUID = "A266282E-3EA9-6FDC-9451-27BD5C67AC65";

	static OcProperties instance = null;

	public static OcProperties getInstance()
	{
		if (instance == null)
		{
			instance = new OcProperties();
		}
		return instance;
	}

	public String getConsumerKey(OcSite aSite)
	{
		switch (aSite)
		{
		case DE:
			return OPENCACHING_DE_CONSUMER_KEY;
		default:
			throw new IllegalArgumentException("OPENCACHING_DE_CONSUMER_KEY for site " + aSite + " not defined");
		}
	}

	public String getUserUuid(OcSite aSite)
	{
		switch (aSite)
		{
		case DE:
			return OPENCACHING_DE_USER_UUID;
		default:
			throw new IllegalArgumentException("OPENCACHING_DE_CONSUMER_KEY for site " + aSite + " not defined");
		}
	}
}
