package thegeocacher.domain.attribute;

import java.util.Date;
import thegeocacher.domain.attribute.base.TimestampAttribute;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class UpdateTimestamp extends TimestampAttribute
{

   public UpdateTimestamp(Date aValue)
   {
      super(aValue);
   }

}
