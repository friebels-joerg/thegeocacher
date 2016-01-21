package thegeocacher.ejb.importer;

import java.util.logging.Logger;

import javax.ejb.Stateless;

/**
 *
 * @author Jörg Friebel
 * @since 17.01.2015
 */
@Stateless
public class ImporterBean
{

	public void start()
	{
		Logger.getLogger(getClass().getSimpleName()).info("start Importer");
	}
}
