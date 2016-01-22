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
	public final static String DOWNLOAD_PATH = "http://download.mapsforge.org/maps/";
	public final static String OFFLINE_PATH = "maps/";

	private String DEFAULT_RENDER_THEME_FILENAME = "hiking" + File.separator + "hiking.xml";

	private static MapsforgeProperties instance;

	public static MapsforgeProperties getInstance()
	{
		if (instance == null)
		{
			instance = new MapsforgeProperties();
		}
		return instance;
	}

	public String getRenderThemeFilename()
	{
		return TheGeocacherProperties.getInstance().getStringValue("mapsforge.latestRenderThemeFileName",
		      DEFAULT_RENDER_THEME_FILENAME);
	}
}
