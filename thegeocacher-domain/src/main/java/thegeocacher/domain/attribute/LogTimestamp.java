package thegeocacher.domain.attribute;

import java.util.Date;

import thegeocacher.domain.attribute.base.TimestampAttribute;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class LogTimestamp extends TimestampAttribute
{
	public LogTimestamp(Date aValue)
	{
		super(aValue);
	}
}
