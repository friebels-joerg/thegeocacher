package thegeocacher.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class Logs
{
	List<Log> values = new ArrayList<Log>();

	public void add(Log aLog)
	{
		values.add(aLog);
	}

}
