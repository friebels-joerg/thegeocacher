package thegeocacher.oc.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QueryParameters
{

	protected Map<String, String> parameters = new HashMap<String, String>();

	public QueryParameters()
	{
		super();
	}

	public QueryParameters(QueryParameters aSomeQueryParameters)
	{
		this();
		parameters.putAll(aSomeQueryParameters.parameters);
	}

	protected void put(String aKey, String aValue)
	{
		parameters.put(aKey, aValue);
	}

	public String get(String aKey)
	{
		return parameters.get(aKey);
	}

	@Override
	public String toString()
	{
		if (parameters.isEmpty())
		{
			return "";
		}
		String result = "";
		boolean first = true;
		for (Entry<String, String> entry : parameters.entrySet())
		{
			if (first)
			{
				result += "?";
				first = false;
			}
			else
			{
				result += "&";
			}
			result += entry.getKey();
			result += "=";
			result += entry.getValue();
		}
		return result;
	}
}