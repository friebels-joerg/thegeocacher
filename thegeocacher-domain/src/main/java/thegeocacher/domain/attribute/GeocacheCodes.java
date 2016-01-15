package thegeocacher.domain.attribute;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class GeocacheCodes
{
	private List<GeocacheCode> values = new ArrayList<GeocacheCode>();

	public void add(GeocacheCode aCode)
	{
		values.add(aCode);
	}
}
