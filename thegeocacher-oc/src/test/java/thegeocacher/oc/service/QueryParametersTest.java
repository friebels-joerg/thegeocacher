package thegeocacher.oc.service;

import org.junit.Assert;
import org.junit.Test;

public class QueryParametersTest
{

   @Test
   public void testGetWithValidKey()
   {
      QueryParameters serviceUnderTest = new QueryParameters();
      serviceUnderTest.put("key", "value");
      Assert.assertEquals("value", serviceUnderTest.get("key"));
   }

   /**
    * Test of get method, of class QueryParameters.
    */
   @Test
   public void testGetWithInvalidKey()
   {
      QueryParameters serviceUnderTest = new QueryParameters();
      serviceUnderTest.put("key", "value");
      Assert.assertNull(serviceUnderTest.get("anotherKey"));
   }

   /**
    * Test of toString method, of class QueryParameters.
    */
   @Test
   public void testToStringWithNoParameters()
   {
      QueryParameters serviceUnderTest = new QueryParameters();
      String result = serviceUnderTest.toString();
      Assert.assertEquals("", result);
   }

   @Test
   public void testToStringWithOneParameters()
   {
      QueryParameters serviceUnderTest = new QueryParameters();
      serviceUnderTest.put("key", "value");
      String result = serviceUnderTest.toString();
      Assert.assertEquals("?key=value", result);
   }

   @Test
   public void testToStringWithSomeParameters()
   {
      QueryParameters serviceUnderTest = new QueryParameters();
      serviceUnderTest.put("key", "value");
      serviceUnderTest.put("key2", "value2");
      String result = serviceUnderTest.toString();
      Assert.assertEquals("?key2=value2&key=value", result);
   }

   @Test
   public void testToStringWithPipeValue()
   {
      QueryParameters serviceUnderTest = new QueryParameters();
      serviceUnderTest.put("key", "value|value2");
      String result = serviceUnderTest.toString();
      Assert.assertEquals("?key=value%7Cvalue2", result);
   }

}
