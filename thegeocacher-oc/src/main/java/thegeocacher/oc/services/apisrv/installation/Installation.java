package thegeocacher.oc.services.apisrv.installation;

public class Installation
{
	String site_url;
	String site_name;
	String okapi_base_url;

	Integer okapi_version_number;
	Integer okapi_revision;
	String okapi_git_revision;

	public String getSite_url()
	{
		return site_url;
	}

	public void setSite_url(String aSite_url)
	{
		site_url = aSite_url;
	}

	public String getSite_name()
	{
		return site_name;
	}

	public void setSite_name(String aSite_name)
	{
		site_name = aSite_name;
	}

	public String getOkapi_base_url()
	{
		return okapi_base_url;
	}

	public void setOkapi_base_url(String aOkapi_base_url)
	{
		okapi_base_url = aOkapi_base_url;
	}

	public Integer getOkapi_version_number()
	{
		return okapi_version_number;
	}

	public void setOkapi_version_number(Integer aOkapi_version_number)
	{
		okapi_version_number = aOkapi_version_number;
	}

	public Integer getOkapi_revision()
	{
		return okapi_revision;
	}

	public void setOkapi_revision(Integer aOkapi_revision)
	{
		okapi_revision = aOkapi_revision;
	}

	public String getOkapi_git_revision()
	{
		return okapi_git_revision;
	}

	public void setOkapi_git_revision(String aOkapi_git_revision)
	{
		okapi_git_revision = aOkapi_git_revision;
	}
}