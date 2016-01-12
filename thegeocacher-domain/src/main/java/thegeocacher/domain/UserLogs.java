package thegeocacher.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class UserLogs
{
	Boolean moreLogsAvailable = Boolean.FALSE;

	List<UserLog> values = new ArrayList<UserLog>();

	public void add(UserLog aLog)
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
