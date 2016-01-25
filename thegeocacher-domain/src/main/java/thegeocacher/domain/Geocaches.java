package thegeocacher.domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 25.01.2016
 */
public class Geocaches implements Serializable
{

	List<Geocache> geocaches;

	public void addGeocache(Geocache geocache)
	{
		geocaches.add(geocache);
	}
}
