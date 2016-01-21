package thegeocacher.web;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import thegeocacher.common.util.ModuleProperties;

/**
 *
 * @author Jörg Friebel
 * @since 13.01.2016
 */
@WebService
@Stateless
public class VersionWebservice
{
	@WebMethod
	public String getVersion()
	{
		return new ModuleProperties(getClass()).getModuleVersion();
	}
}
