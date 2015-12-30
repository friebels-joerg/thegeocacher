package thegeocacher.oc.service.installations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Installations implements Iterable<Installation>
{
	private List<Installation> installations = new ArrayList<Installation>();

	public Installations(List<Installation> aInstallations)
	{
		super();
		installations.addAll(aInstallations);
	}

	public Iterator<Installation> iterator()
	{
		return installations.iterator();
	}

	public int size()
	{
		return installations.size();
	}
}
