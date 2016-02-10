package thegeocacher.oc.services;

import thegeocacher.common.web.SimpleHttpRequestExecuter;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheId;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
abstract public class OcService
{
	OcSite site = OcSite.DE;

	abstract protected OcMethod getOcMethod();

	protected OcService()
	{
		super();
	}

	protected OcService(OcSite aSite)
	{
		super();
		site = aSite;
	}

	public String getUrl(QueryParameters someParameters)
	{
		QueryParameters queryParameters = new QueryParameters(someParameters);
		if (getOcMethod().getAuthenticationLevel() == AuthenticationLevel.Level1)
		{
			queryParameters.put("consumer_key", OcProperties.getInstance().getConsumerKey(site));
		}
		if (someParameters instanceof UserUuidSetable)
		{
			queryParameters.setUserUuid(site);
		}
		String url = site.getOkapiUrl() + getOcMethod().getMethodName() + queryParameters.toString();
		return url;
	}

	protected String callOcService(QueryParameters someParameters)
	{
		String url = getUrl(someParameters);
		String response = new SimpleHttpRequestExecuter().getResponse(url);
		return response;
	}

	public OcSite getSite()
	{
		return site;
	}

	protected GeocacheId getGeocacheId(String code)
	{
		GeocacheId geocacheId = new GeocacheId(new GeocacheCode(code), getSite().getProvider());
		return geocacheId;
	}
}