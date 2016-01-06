package thegeocacher.domain.attribute.base;

import java.io.Serializable;

public class DoubleAttribute implements Serializable
{
	Double value;

	public DoubleAttribute(Double value)
	{
		super();
		this.value = value;
	}

	public Double getValue()
	{
		return value;
	}
}