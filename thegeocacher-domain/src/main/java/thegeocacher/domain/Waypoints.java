package thegeocacher.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Waypoints implements Serializable
{

	List<Waypoint> waypoints = new ArrayList<Waypoint>();

	public void addWaypoint(Waypoint waypoint)
	{
		waypoints.add(waypoint);
	}
}