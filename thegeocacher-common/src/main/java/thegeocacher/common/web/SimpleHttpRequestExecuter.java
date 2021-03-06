package thegeocacher.common.web;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Jörg Friebel
 * @since 01.01.2016
 */
public class SimpleHttpRequestExecuter
{
	public String getResponse(String anUrl)
	{
		if (WebProperties.getInstance().isProxyRequiered())
		{
			String response = getResponseViaProxy(anUrl);
			return response;
		}
		else
		{
			String response = getResponseWithoutProxy(anUrl);
			return response;
		}
	}

	String getResponseViaProxy(String anUrl)
	{
		CloseableHttpClient httpclient = null;
		try
		{
			RequestConfig config = null;
			CredentialsProvider credsProvider = new BasicCredentialsProvider();
			credsProvider.setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
			         new UsernamePasswordCredentials(WebProperties.getInstance().getProxyUser(), WebProperties
			                  .getInstance().getProxyPassword()));

			httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();

			HttpHost proxy = new HttpHost(WebProperties.getInstance().getProxyHost(), WebProperties.getInstance()
			         .getProxyPort(), WebProperties.getInstance().getProxyScheme());

			config = RequestConfig.custom().setProxy(proxy).build();

			HttpGet request = new HttpGet(anUrl);
			request.setConfig(config);

			CloseableHttpResponse response = httpclient.execute(request);
			String responseString = EntityUtils.toString(response.getEntity());
			return responseString;
		}
		catch (IOException ex)
		{
			Logger.getLogger(SimpleHttpRequestExecuter.class.getName()).log(Level.SEVERE, null, ex);
			throw new RuntimeException(ex);
		}
		finally
		{
			if (httpclient != null)
			{
				try
				{
					httpclient.close();
				}
				catch (IOException ex)
				{
					Logger.getLogger(SimpleHttpRequestExecuter.class.getName()).log(Level.SEVERE, null, ex);
					throw new RuntimeException(ex);
				}
			}
		}
	}

	String getResponseWithoutProxy(String anUrl)
	{
		try
		{
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet request = new HttpGet(anUrl);
			CloseableHttpResponse response = httpclient.execute(request);
			String responseString = EntityUtils.toString(response.getEntity());
			return responseString;
		}
		catch (IOException ex)
		{
			Logger.getLogger(SimpleHttpRequestExecuter.class.getName()).log(Level.SEVERE, null, ex);
			throw new RuntimeException(ex);
		}

	}

}
