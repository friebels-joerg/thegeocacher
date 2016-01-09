package thegeocacher.oc.service.geocache.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class OcGetGeocacheStatusResult
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
