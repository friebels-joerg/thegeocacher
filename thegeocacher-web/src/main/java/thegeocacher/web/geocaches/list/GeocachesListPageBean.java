package thegeocacher.web.geocaches.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import thegeocacher.domain.Geocache;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.GeocacheId;
import thegeocacher.domain.attribute.GeocacheProvider;

/**
 *
 * @author Jörg Friebel
 * @since 20.01.2015
 */
@SessionScoped
@ManagedBean
public class GeocachesListPageBean implements Serializable
{
	public List<Geocache> getGeocaches()
	{
		ArrayList<Geocache> geocaches = createSampleData();
		return geocaches;
	}

	private ArrayList<Geocache> createSampleData()
	{
		ArrayList<Geocache> geocaches = new ArrayList<Geocache>();
		Geocache geocache = new Geocache();
		GeocacheId id = new GeocacheId(new GeocacheCode("OC1234"), GeocacheProvider.OC_DE);
		geocache.setId(id);
		geocaches.add(geocache);

		geocache = new Geocache();
		id = new GeocacheId(new GeocacheCode("OC1235"), GeocacheProvider.OC_DE);
		geocache.setId(id);
		geocaches.add(geocache);
		return geocaches;
	}

}
