package thegeocacher.web.importer;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import thegeocacher.ejb.importer.ImporterBeanLocal;

/**
 *
 * @author Jörg Friebel
 * @since 17.01.2015
 */
@ManagedBean(name = "importerBean")
public class ImporterPageBean
{
   @EJB
   ImporterBeanLocal importer;

   public void start()
   {
      importer.start();
   }

}
