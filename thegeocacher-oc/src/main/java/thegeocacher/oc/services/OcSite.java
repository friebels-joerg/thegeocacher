package thegeocacher.oc.services;

import thegeocacher.domain.attribute.GeocacheProvider;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public enum OcSite
{
	// PL("Opencaching.PL", "http://opencaching.pl/okapi/"),
	// US("Opencaching.US", "http://www.opencaching.us/okapi/"),
	// NL("Opencaching.NL", "http://www.opencaching.nl/okapi/"),
	// RO("Opencaching.RO", "http://www.opencaching.ro/okapi/");
	DE("http://www.opencaching.de/okapi/", GeocacheProvider.OC_DE);

	String okapiUrl;
	GeocacheProvider provider;

	OcSite(String anOkapiUrl, GeocacheProvider aProvider)
	{
		okapiUrl = anOkapiUrl;
		provider = aProvider;
	}

	public String getOkapiUrl()
	{
		return okapiUrl;
	}

	public GeocacheProvider getProvider()
	{
		return provider;
	}
}
