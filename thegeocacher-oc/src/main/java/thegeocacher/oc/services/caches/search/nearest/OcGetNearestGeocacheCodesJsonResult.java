package thegeocacher.oc.services.caches.search.nearest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OcGetNearestGeocacheCodesJsonResult implements Iterable<String>
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