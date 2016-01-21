package thegeocacher.ejb;

import javax.ejb.Stateless;

import thegeocacher.common.util.ModuleProperties;

/**
 *
 * @author Jörg Friebel
 * @since 13.01.2016
 */
@Stateless
public class VersionService
{
	public String getVersion()
	{
		return new ModuleProperties(getClass()).getModuleVersion();
	}

}
