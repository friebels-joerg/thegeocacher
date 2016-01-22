package thegeocacher.ejb.map;

import java.io.File;

import thegeocacher.common.util.TheGeocacherProperties;

/**
 *
 * @author Jörg Friebel
 * @since 19.01.2016
 */
public class MapProperties
{
	private static final String PROPERTY_PREFIX = "map";

	private static final String DEFAULT_RENDER_THEME_FILENAME = "hiking" + File.separator + "hiking.xml";
	private static final String DEFAULT_MAP_FILENAME = "nordrhein-westfalen.map";

	private static MapProperties instance;

	public static MapProperties getInstance()
	{
		if (instance == null)
		{
			instance = new MapProperties();
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

	public String getLatestMapFilename()
	{
		return getStringValue("latestMapFileName", DEFAULT_MAP_FILENAME);
	}
}
