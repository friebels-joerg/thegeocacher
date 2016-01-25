package thegeocacher.domain.attribute.base;

import java.io.Serializable;

/**
 *
 * @author Jörg Friebel
 * @since 25.01.2016
 */
public class StringAttribute implements Serializable
{
	String value;

	public StringAttribute(String aValue)
	{
		super();
		value = aValue;
	}

	public String getValue()
	{
		return value;
	}

	@Override
	public String toString()
	{
		return getClass().getSimpleName() + ": " + getValue();
	}

}
