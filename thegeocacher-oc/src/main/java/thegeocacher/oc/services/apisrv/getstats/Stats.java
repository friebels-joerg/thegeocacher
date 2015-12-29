package thegeocacher.oc.services.apisrv.getstats;

public class Stats {

	Integer cache_count;
	Integer user_count;
	Integer apps_count;
	Integer apps_active;

	/**
	 * @see #cache_count
	 */
	public Integer getCache_count() {
		return cache_count;
	}

	/**
	 * @see #cache_count
	 */
	public void setCache_count(Integer aCache_count) {
		cache_count = aCache_count;
	}

	/**
	 * @see #user_count
	 */
	public Integer getUser_count() {
		return user_count;
	}

	/**
	 * @see #user_count
	 */
	public void setUser_count(Integer aUser_count) {
		user_count = aUser_count;
	}

	/**
	 * @see #apps_count
	 */
	public Integer getApps_count() {
		return apps_count;
	}

	/**
	 * @see #apps_count
	 */
	public void setApps_count(Integer aApps_count) {
		apps_count = aApps_count;
	}

	/**
	 * @see #apps_active
	 */
	public Integer getApps_active() {
		return apps_active;
	}

	/**
	 * @see #apps_active
	 */
	public void setApps_active(Integer aApps_active) {
		apps_active = aApps_active;
	}

}
