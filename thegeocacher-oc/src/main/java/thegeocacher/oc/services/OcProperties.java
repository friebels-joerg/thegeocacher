package thegeocacher.oc.services;

/**
 *
 * @author Jörg Friebel
 * @since 01.01.2016
 */
public class OcProperties
{
	static final String CONSUMER_KEY = "f8k87aHFAVaCn5K9gAeM";
	static final String CONSUMER_SECRET = "ahURUXEUcUbhSmgPmPmMBmePgQNqfT2g2MXLBtxD";

	static final String USER_UUID = "A266282E-3EA9-6FDC-9451-27BD5C67AC65";

	static OcProperties instance = null;

	public static OcProperties getInstance()
	{
		if (instance == null)
		{
			instance = new OcProperties();
		}
		return instance;
	}

	public String getConsumerKey()
	{
		return CONSUMER_KEY;
	}

	public String getUserUuid()
	{
		return USER_UUID;
	}
}
