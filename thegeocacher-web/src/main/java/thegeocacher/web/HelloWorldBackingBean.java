package thegeocacher.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @see http://www.javabeat.net/jsf-2-installation-configuration-maven-3/
 * @author Jörg Friebel
 * @since 13.01.2016
 */
@ManagedBean
@SessionScoped
public class HelloWorldBackingBean
{
	private String helloProperty = "Hello World !";

	public String getHelloProperty()
	{
		return helloProperty;
	}

	public void setHelloProperty(String aHelloProperty)
	{
		helloProperty = aHelloProperty;
	}
}