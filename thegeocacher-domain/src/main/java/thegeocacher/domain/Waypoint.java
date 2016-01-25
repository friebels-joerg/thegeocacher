package thegeocacher.domain;

import java.io.Serializable;

import thegeocacher.domain.attribute.WaypointId;
import thegeocacher.domain.attribute.Wgs84Coordinates;

/**
 * 
 * @author Jörg Friebel
 * @since 25.01.2016
 */
public class Waypoint implements Serializable
{
	WaypointId id = new WaypointId();
	Wgs84Coordinates coordinates;

}
