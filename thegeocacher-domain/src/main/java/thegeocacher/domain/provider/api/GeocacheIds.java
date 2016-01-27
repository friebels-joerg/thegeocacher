package thegeocacher.domain.provider.api;

import java.util.ArrayList;
import java.util.List;
import thegeocacher.domain.attribute.GeocacheId;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class GeocacheIds
{
	private List<GeocacheId> values = new ArrayList<GeocacheId>();

	public void add(GeocacheId anId)
	{
		values.add(anId);
	}
}
