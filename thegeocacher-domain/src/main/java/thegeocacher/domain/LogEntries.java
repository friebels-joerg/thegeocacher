package thegeocacher.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class LogEntries
{
	Boolean moreLogsAvailable = Boolean.FALSE;

	List<LogEntry> values = new ArrayList<LogEntry>();

	public void add(LogEntry aLog)
	{
		values.add(aLog);
	}

	public Boolean areMoreLogsAvailable()
	{
		return moreLogsAvailable;
	}

	public void setMoreLogsAvailable(Boolean aMoreLogsAvailable)
	{
		moreLogsAvailable = aMoreLogsAvailable;
	}

}
