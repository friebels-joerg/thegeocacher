package thegeocacher.oc.services.caches.geocache.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class OcGeocacheStatus
{
	@JsonProperty(value = "code")
	String code;

	@JsonProperty(value = "status")
	String status;

	@JsonProperty(value = "last_modified")
	Date last_modified;

	public String getStatus()
	{
		return status;
	}

	public String getCode()
	{
		return code;
	}

	public Date getLastModified()
	{
		return last_modified;
	}

}
