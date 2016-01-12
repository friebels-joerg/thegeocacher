package thegeocacher.oc.services.logs.userlogs;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */
public class OcUserLog
{
	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("date")
	private Date date;

	@JsonProperty("cache_code")
	private String cacheCode;

	@JsonProperty("type")
	private String type;

	@JsonProperty("comment")
	private String comment;

	public String getUuid()
	{
		return uuid;
	}

	public String getCacheCode()
	{
		return cacheCode;
	}

	public String getComment()
	{
		return comment;
	}

	public Date getDate()
	{
		return date;
	}

	public String getType()
	{
		return type;
	}

}