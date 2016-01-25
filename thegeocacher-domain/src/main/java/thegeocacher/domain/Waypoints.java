package thegeocacher.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jörg Friebel
 * @since 25.01.2016
 */
public class Waypoints implements Serializable
{

	List<Waypoint> values = new ArrayList<Waypoint>();

	public void addWaypoint(Waypoint aWaypoint)
	{
		values.add(aWaypoint);
	}
}