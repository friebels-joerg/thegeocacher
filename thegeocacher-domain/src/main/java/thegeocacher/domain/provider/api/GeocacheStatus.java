package thegeocacher.domain.provider.api;

import org.apache.commons.lang3.builder.ToStringBuilder;
import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.domain.attribute.GeocacheId;
import thegeocacher.domain.attribute.UpdateTimestamp;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public class GeocacheStatus
{

	GeocacheId id;

	GeocacheAvailability availability;

	UpdateTimestamp latestModificationTimestamp;

	public GeocacheAvailability getAvailability()
	{
		return availability;
	}

	public void setAvailability(GeocacheAvailability anAvailability)
	{
		availability = anAvailability;
	}

	public GeocacheId getId()
	{
		return id;
	}

	public void setId(GeocacheId aId)
	{
		id = aId;
	}

	public UpdateTimestamp getLatestModificationTimestamp()
	{
		return latestModificationTimestamp;
	}

	public void setLatestModificationTimestamp(UpdateTimestamp aLastModified)
	{
		latestModificationTimestamp = aLastModified;
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this);
	}
}
