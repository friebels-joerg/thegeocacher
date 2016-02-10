package thegeocacher.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jörg Friebel
 * @since 21.01.2016
 */
public class TheGeocacherProperties
{
	private static final Logger LOGGER = Logger.getLogger(TheGeocacherProperties.class.getSimpleName());
	private static final String PROPERTY_FILENAME = "thegeocacher.properties";

	private static TheGeocacherProperties instance;

	public static TheGeocacherProperties getInstance()
	{
		if (instance == null)
		{
			instance = new TheGeocacherProperties();
		}
		return instance;
	}

	Properties properties;

	private TheGeocacherProperties()
	{
		super();
		properties = new Properties();
		try
		{
			String filename = getAbsolutePropertiesFilename();
			properties.load(new FileInputStream(filename));
		}
		catch (IOException e)
		{
			LOGGER.log(Level.SEVERE, null, e);
		}
	}

	String getUserHome()
	{
		String userHome = System.getProperty("user.home");
		return userHome;
	}

	final String getAbsolutePropertiesFilename()
	{
		String absolutePropertiesFilename = getUserHome() + File.separator + PROPERTY_FILENAME;
		return absolutePropertiesFilename;
	}

	public String getBaseDir()
	{
		String baseDir = getStringValue("basedir");
		return baseDir;
	}

	public String getStringValue(String aKey)
	{
		final Object value = properties.get(aKey);
		if (value == null)
		{
			return null;
		}
		String stringValue = "" + value;
		return stringValue;
	}

	public String getStringValue(String aKey, String aDefault)
	{
		String value = getStringValue(aKey);
		if (value == null)
		{
			value = aDefault;
			setValue(aKey, value);
		}
		return value;
	}

	private void setValue(String aKey, String aValue)
	{
		try
		{
			properties.setProperty(aKey, aValue);
			properties.store(new FileOutputStream(getAbsolutePropertiesFilename()), "");
		}
		catch (FileNotFoundException e)
		{
			LOGGER.log(Level.SEVERE, null, e);
		}
		catch (IOException e)
		{
			LOGGER.log(Level.SEVERE, null, e);
		}
	}

	public String getStringValue(String aPropertyPrefix, String aKey, String aDefault)
	{
		String key = aPropertyPrefix + "." + aKey;
		String value = getStringValue(key, aDefault);
		return value;
	}
}