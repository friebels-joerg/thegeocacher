package thegeocacher.domain.attribute.base;

/**
 *
 * @author Jörg Friebel
 * @since 15.01.2016
 */
public class TranslateableStringAttribute extends StringAttribute
{
	LanguageIsoCode language;

	public TranslateableStringAttribute(String aValue, LanguageIsoCode aLanguage)
	{
		super(aValue);
		language = aLanguage;
	}

	public LanguageIsoCode getLanguage()
	{
		return language;
	}
}
