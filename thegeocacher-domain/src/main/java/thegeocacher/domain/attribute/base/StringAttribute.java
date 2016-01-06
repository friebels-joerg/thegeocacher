package thegeocacher.domain.attribute.base;

import java.io.Serializable;

public class StringAttribute implements Serializable
{
	String value;

	public StringAttribute(String value)
	{
		super();
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
}