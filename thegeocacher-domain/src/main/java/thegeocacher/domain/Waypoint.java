package thegeocacher.domain;

import thegeocacher.domain.attribute.WaypointId;
import java.io.Serializable;

public class Waypoint implements Serializable
{
   WaypointId id = new WaypointId();
   Wgs84Coordinates coordinates;

}
