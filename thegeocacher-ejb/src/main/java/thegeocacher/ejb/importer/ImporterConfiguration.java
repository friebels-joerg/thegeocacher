package thegeocacher.ejb.importer;

import java.io.Serializable;

/**
 *
 * @author Jörg Friebel
 * @since 18.01.2016
 */
public class ImporterConfiguration implements Serializable
{
   ProviderImportConfigurations providerImportConfigurations = new ProviderImportConfigurations();

}
