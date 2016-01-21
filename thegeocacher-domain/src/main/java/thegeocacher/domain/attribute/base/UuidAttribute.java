package thegeocacher.domain.attribute.base;

import java.util.UUID;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class UuidAttribute extends StringAttribute
{
	public UuidAttribute()
	{
		super(UUID.randomUUID().toString());
	}

	public UuidAttribute(String aValue)
	{
		super(aValue);
	}
}