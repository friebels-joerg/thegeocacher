package thegeocacher.oc.services;

import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheId;

import thegeocacher.common.web.SimpleHttpRequestExecuter;

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
		return site.getOkapiUrl() + getOcMethod().getMethodName() + queryParameters.toString();
	}

	protected String callOcService(QueryParameters someParameters)
	{
		String url = getUrl(someParameters);
		return new SimpleHttpRequestExecuter().getResponse(url);
	}

	public OcSite getSite()
	{
		return site;
	}

	protected GeocacheId getGeocacheId(String code)
   {
   	return new GeocacheId(new GeocacheCode(code), getSite().getProvider());
   }
}