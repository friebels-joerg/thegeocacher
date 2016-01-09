package thegeocacher.oc.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
      try
      {
         String value = URLEncoder.encode(aValue, "UTF-8");
         parameters.put(aKey, value);
      } catch (UnsupportedEncodingException ex)
      {
      }
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
         } else
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
