package thegeocacher.domain.attribute.base;

import java.io.Serializable;

/**
 *
 * @author Jörg Friebel
 * @since 25.01.2016
 */
public class DoubleAttribute implements Serializable
{
	Double value;

	public DoubleAttribute(Double aValue)
	{
		super();
		value = aValue;
	}

	public Double getValue()
	{
		return value;
	}
}