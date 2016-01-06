package thegeocacher.domain.attribute.base;

import java.util.UUID;

public class UuidAttribute extends StringAttribute
{
	public UuidAttribute()
	{
		super(UUID.randomUUID().toString());
	}

	public UuidAttribute(String value)
	{
		super(value);
	}
}