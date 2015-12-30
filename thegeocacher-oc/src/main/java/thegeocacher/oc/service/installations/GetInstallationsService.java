package thegeocacher.oc.service.installations;

import java.io.IOException;
import java.util.List;

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

import thegeocacher.oc.service.AuthenticationLevel;
import thegeocacher.oc.service.OcService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetInstallationsService extends OcService
{

	String getContent()
	{
		CloseableHttpClient httpclient = null;
		try
		{
			CredentialsProvider credsProvider = new BasicCredentialsProvider();
			credsProvider.setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
					new UsernamePasswordCredentials("dt0a19", "E$r5t6z7"));

			httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();

			HttpHost target = new HttpHost("www.opencaching.de");

			HttpHost proxy = new HttpHost("squid.intdus.retail-sc.com", 3128, "http");

			RequestConfig config = RequestConfig.custom().setProxy(proxy).build();

			HttpGet request = new HttpGet("/okapi/services/apisrv/installations");
			request.setConfig(config);

			System.out.println("Executing request " + request.getRequestLine() + " to " + target + " via " + proxy);

			CloseableHttpResponse response = httpclient.execute(target, request);
			try
			{
				System.out.println("----------------------------------------");
				System.out.println(response.getStatusLine());
				String result = EntityUtils.toString(response.getEntity());
				System.out.println(result);
				return result;
			}
			finally
			{
				response.close();
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			try
			{
				httpclient.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException(e);
			}
		}
	}

	public Installations convertJsonStringToPojo(String aString)
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			List<Installation> installations = mapper.readValue(aString, new TypeReference<List<Installation>>()
			{
				//
			});

			return new Installations(installations);
		}
		catch (JsonParseException e)
		{
			throw new RuntimeException(e);
		}
		catch (JsonMappingException e)
		{
			throw new RuntimeException(e);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	protected AuthenticationLevel getAuthenticationLevel()
	{
		return AuthenticationLevel.Level0;
	}

	@Override
	protected String getMethodName()
	{
		return "services/apisrv/installations";
	}
}
