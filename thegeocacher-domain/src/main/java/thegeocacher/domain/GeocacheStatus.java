package thegeocacher.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import thegeocacher.domain.attribute.GeocacheAvailability;
import thegeocacher.domain.attribute.GeocacheCode;
import thegeocacher.domain.attribute.UpdateTimestamp;

/**
 *
 * @author Jörg Friebel
 * @since 08.01.2016
 */
public class GeocacheStatus
{

   GeocacheCode code;

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

   public GeocacheCode getCode()
   {
      return code;
   }

   public void setCode(GeocacheCode aCode)
   {
      code = aCode;
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
