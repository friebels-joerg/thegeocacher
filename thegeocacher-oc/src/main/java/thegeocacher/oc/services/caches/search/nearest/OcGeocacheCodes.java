package thegeocacher.oc.services.caches.search.nearest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcGeocacheCodes implements Iterable<String>
{
	@JsonProperty("results")
	private List<String> results = new ArrayList<String>();

	@JsonProperty("more")
	private Boolean more;

	public Boolean getMore()
	{
		return more;
	}

	public Iterator<String> iterator()
	{
		return results.iterator();
	}
}