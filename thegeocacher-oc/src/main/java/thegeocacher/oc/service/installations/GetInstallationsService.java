package thegeocacher.oc.service.installations;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import thegeocacher.oc.service.OcMethod;
import thegeocacher.oc.service.OcService;

public class GetInstallationsService extends OcService
{
   String getContent()
   {
      return null;// new SimpleHttpRequestExecuter().getResponse(getUrl(null));
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
      } catch (JsonParseException e)
      {
         throw new RuntimeException(e);
      } catch (JsonMappingException e)
      {
         throw new RuntimeException(e);
      } catch (IOException e)
      {
         throw new RuntimeException(e);
      }
   }

   @Override
   protected OcMethod getOcMethod()
   {
      return OcMethod.Installations;
   }

}
