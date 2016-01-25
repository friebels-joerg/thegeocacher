package thegeocacher.oc.services.caches.geocache.full;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcLanguageTexts
{

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonIgnore
	private List<OcLanguageText> languageTexts;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties()
	{
		return additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value)
	{
		additionalProperties.put(name, value);
	}

	public String getLangugage()
	{
		return getFirstEntry().getKey();
	}

	public String getText()
	{
		return getFirstEntry().getValue() + "";
	}

	Entry<String, Object> getFirstEntry()
	{
		if (additionalProperties.isEmpty())
		{
			return null;
		}

		return additionalProperties.entrySet().iterator().next();
	}

	/**
	 * @see #languageTexts
	 */
	public List<OcLanguageText> getLanguageTexts()
	{
		if (languageTexts == null)
		{
			languageTexts = new ArrayList<OcLanguageText>();

			Iterator<Entry<String, Object>> iterator = additionalProperties.entrySet().iterator();

			while (iterator.hasNext())
			{
				Entry<String, Object> entry = iterator.next();
				OcLanguageText languageText = new OcLanguageText();
				languageText.languageIsoCode = entry.getKey();
				languageText.text = entry.getValue() + "";
				languageTexts.add(languageText);
			}
		}
		return languageTexts;
	}
}
