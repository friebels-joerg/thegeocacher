package thegeocacher.domain.attribute;

import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 15.01.2015
 */
public class GeocacheNames
{
	List<GeocacheName> values;

	public void add(GeocacheName aName)
	{
		values.add(aName);
	}
}
