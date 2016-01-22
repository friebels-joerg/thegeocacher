package thegeocacher.ejb.mapsforge;

import java.io.File;

import thegeocacher.common.util.TheGeocacherProperties;

/**
 *
 * @author Jörg Friebel
 * @since 19.01.2016
 */
public class MapsforgeProperties
{
	private static final String PROPERTY_PREFIX = "mapsforge";

	private static final String DEFAULT_RENDER_THEME_FILENAME = "hiking" + File.separator + "hiking.xml";

	private static MapsforgeProperties instance;

	public static MapsforgeProperties getInstance()
	{
		if (instance == null)
		{
			instance = new MapsforgeProperties();
		}
		return instance;
	}

	public String getLatestRenderThemeFilename()
	{
		return getStringValue("latestRenderThemeFileName", DEFAULT_RENDER_THEME_FILENAME);
	}

	private String getStringValue(String aKey, String aDefault)
	{
		return TheGeocacherProperties.getInstance().getStringValue(PROPERTY_PREFIX, aKey, aDefault);
	}
}
