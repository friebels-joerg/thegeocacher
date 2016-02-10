package thegeocacher.web.geocaches.map;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jörg Friebel
 * @since 20.01.2015
 */
@SessionScoped
@ManagedBean
public class MapPageBean implements Serializable
{
	public Double getCenterLatitude()
	{
		return 51.22666790215265;
	}

	public Double getCenterLongitude()
	{
		return 6.773414611816406;
	}

	public Integer getZoomLevel()
	{
		return 13;
	}
}
