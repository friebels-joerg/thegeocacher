package thegeocacher.domain;

import thegeocacher.domain.attribute.base.LanguageIsoCode;
import thegeocacher.domain.attribute.base.TranslateableStringAttribute;

/**
 *
 * @author Jörg Friebel
 * @since 15.01.2016
 */
public class GeocacheName extends TranslateableStringAttribute
{
	public GeocacheName(String aValue, LanguageIsoCode aLanguage)
	{
		super(aValue, aLanguage);
	}
}