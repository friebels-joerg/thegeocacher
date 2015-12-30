package thegeocacher.oc.service;

abstract public class OcService
{
	static final String CONSUMER_KEY = "f8k87aHFAVaCn5K9gAeM";
	static final String CONSUMER_SECRET = "ahURUXEUcUbhSmgPmPmMBmePgQNqfT2g2MXLBtxD";

	abstract protected AuthenticationLevel getAuthenticationLevel();

	abstract protected String getMethodName();

	public OcService()
	{
		super();
	}

	public String getUrl(QueryParameters someQueryParameters)
	{
		QueryParameters queryParameters = new QueryParameters(someQueryParameters);

		if (getAuthenticationLevel() == AuthenticationLevel.Level1)
		{
			queryParameters.put("consumer_key", CONSUMER_KEY);
		}
		return "http://www.opencaching.de/okapi/" + getMethodName() + queryParameters.toString();
	}
}