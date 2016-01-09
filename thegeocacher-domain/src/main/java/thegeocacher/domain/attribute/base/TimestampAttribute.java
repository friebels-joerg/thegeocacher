package thegeocacher.domain.attribute.base;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jörg Friebel
 * @since 09.01.2016
 */
public class TimestampAttribute implements Serializable
{
   Date value;

   public TimestampAttribute(Date aValue)
   {
      super();
      value = aValue;
   }

   public Date getValue()
   {
      return value;
   }
}
