package thegeocacher.domain;

import java.util.ArrayList;
import java.util.List;

import thegeocacher.domain.attribute.GeocacheCode;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class GeocacheCodes
{
	private List<GeocacheCode> geocacheCodes = new ArrayList<GeocacheCode>();

	public void add(GeocacheCode aCode)
	{
		geocacheCodes.add(aCode);
	}
}
