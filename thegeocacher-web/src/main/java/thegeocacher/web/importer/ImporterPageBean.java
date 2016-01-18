package thegeocacher.web.importer;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import thegeocacher.ejb.importer.ImporterBean;

/**
 *
 * @author Jörg Friebel
 * @since 17.01.2015
 */
@SessionScoped
@ManagedBean
public class ImporterPageBean
{
	@EJB
	ImporterBean importer;

	public void start()
	{
		importer.start();
	}

}
