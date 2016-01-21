/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegeocacher.ejb;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author joerg
 */
public class TheGeocacherPropertiesTest
{

   @Test
   public void testGetPath()
   {
      System.out.println("getPath");
      TheGeocacherProperties instance = new TheGeocacherProperties();
      String expResult = "/home/joerg/thegeocacher";
      String result = instance.getPath();
      Assert.assertEquals(expResult, result);
   }

}
