package thegeocacher.domain;

import thegeocacher.domain.attribute.GeocacheId;
import thegeocacher.domain.attribute.LogText;
import thegeocacher.domain.attribute.LogTimestamp;
import thegeocacher.domain.attribute.LogType;
import thegeocacher.domain.attribute.LogUuid;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class LogEntry
{
	LogUuid uuid;
	GeocacheId geocacheId;
	LogText text;
	LogTimestamp timestamp;
	LogType type;

	public LogUuid getUuid()
	{
		return uuid;
	}

	public void setUuid(LogUuid anUuid)
	{
		uuid = anUuid;
	}

	public GeocacheId getGeocacheId()
	{
		return geocacheId;
	}

	public void setGeocacheId(GeocacheId aGeocacheId)
	{
		geocacheId = aGeocacheId;
	}

	public LogText getText()
	{
		return text;
	}

	public void setText(LogText aText)
	{
		text = aText;
	}

	public LogTimestamp getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(LogTimestamp aTimestamp)
	{
		timestamp = aTimestamp;
	}

	public LogType getType()
	{
		return type;
	}

	public void setType(LogType aType)
	{
		type = aType;
	}

}
