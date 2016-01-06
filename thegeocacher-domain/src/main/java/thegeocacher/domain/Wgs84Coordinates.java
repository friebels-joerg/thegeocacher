package thegeocacher.domain;

import java.io.Serializable;

import thegeocacher.domain.attribute.Wgs84Latitude;
import thegeocacher.domain.attribute.Wgs84Longitude;

public class Wgs84Coordinates implements Serializable
{
	Wgs84Latitude latitude;
	Wgs84Longitude longitude;

}
