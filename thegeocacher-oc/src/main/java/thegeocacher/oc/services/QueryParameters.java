package thegeocacher.oc.services;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class QueryParameters
{

	protected Map<String, String> parameters = new HashMap<String, String>();

	public QueryParameters()
	{
		super();
	}

	public QueryParameters(QueryParameters someParameters)
	{
		this();
		if (someParameters != null)
		{
			parameters.putAll(someParameters.parameters);
		}
	}

	protected void put(String aKey, String aValue)
	{
		parameters.put(aKey, aValue);
	}

	public String get(String aKey)
	{
		String value = parameters.get(aKey);
		return value;
	}

	public void setUserUuid(OcSite aSite)
	{
		put("user_uuid", OcProperties.getInstance().getUserUuid(aSite));
	}

	@Override
	public String toString()
	{
		if (parameters.isEmpty())
		{
			return "";
		}
		try
		{
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
				String value = URLEncoder.encode(entry.getValue(), "UTF-8");
				result += value;
			}
			return result;
		}
		catch (UnsupportedEncodingException e)
		{
			return "";
		}
	}
}
