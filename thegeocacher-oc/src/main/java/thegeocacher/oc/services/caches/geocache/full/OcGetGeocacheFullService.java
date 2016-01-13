package thegeocacher.oc.services.caches.geocache.full;

import java.io.IOException;

import thegeocacher.oc.services.OcMethod;
import thegeocacher.oc.services.OcService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * http://www.opencaching.de/okapi/services/caches/geocache?consumer_key=
 * f8k87aHFAVaCn5K9gAeM&cache_code=OC1294E&user_uuid=A266282E-
 * 3EA9-6FDC-9451-27BD5C67AC65&fields=code|name|location|type|status|owner|gc_code|is_found|is_not_found|founds|notfounds|willattends|size2|difficulty|terrain|trip_time|trip_distance|rating|rating_votes|recommendations|req_passwd|short_description|description|hint2|images|preview_image|attr_acodes|latest_logs|trackables_count|trackables|alt_wpts|country|state|protection_areas|last_found|last_modified|date_created|date_h
 * i d d e n
 *
 *
 * {"code":"OC1294E","name":"OC-Stammtisch D\u00fcsseldorf
 * 16\/01","location":"51.226967
 * |6.774383","type":"Event","status":"Available","gc_code
 * ":null,"founds":1,"notfounds
 * ":0,"willattends":8,"size2":"none","difficulty":1,"
 * terrain":1,"trip_time":null,"
 * trip_distance":null,"rating":null,"rating_votes":0,"
 * recommendations":0,"req_passwd
 * ":false,"last_found":"2016-01-05T00:00:00+01:00","
 * last_modified":"2016-01-02T19
 * :53:15+01:00","date_created":"2016-01-02T17:39:37
 * +01:00","date_hidden":"2016-01
 * -05T00:00:00+01:00","owner":{"uuid":"33c32c38-3f
 * 3a-11e3-8369-525400a7f25b","username
 * ":"Linusus","profile_url":"http:\/\/www.opencaching
 * .de\/viewprofile.php?userid
 * =280542"},"is_found":false,"is_not_found":false,"short_description":"Der
 * Geocaching-Stammtisch f\u00fcr D\u00fcsseldorf und Umgebung","description":"
 * <p style=\"text-align:center;\">
 * <span style=\"font-family:arial, helvetica, sans-serif;font-size:small;\">Der
 * Geocaching-Stammtisch f\u00fcr alle die gerne Gleichgesinnte
 * treffen.<\/span><\/p>\n
 * <p style=\"text-align:center;\">
 * <span style=\"font-family:arial, helvetica, sans-serif;font-size:small;\">Es
 * ist dabei egal ob ihr Alt-Cacher, Jung-Cacher, Neu-Cacher,
 * Mehrfach-Listing-Cacher oder sonstwie geartete Cacher seit. :)<\/span><\/p>\n
 * <p style=\"text-align:center;\">
 * <span style=\"font-family:arial, helvetica,
 * sans-serif;font-size:small;\">Nach\n jetzt anderthalb Jahren mit nur einem
 * Listing f\u00fcr unseren monatlichen \nStammtisch haben wir uns bei unserem
 * Dezember-Treffen entschieden f\u00fcr jeden ersten Dienstag im Monat \nein
 * eigenes Listing zu erstellen.<\/span><\/p>\n
 * <p style=\"text-align:center;\">
 * <span style=\"font-family:arial, helvetica, sans-serif;font-size:small;\">Der
 * Stammtisch wird \"indoor\" durchgef\u00fchrt. \nDie Position zeigt auf eine
 * Lokalit\u00e4t in der mindestens Getr\u00e4nke \nausgesch\u00e4nkt werden.
 * Selbstverst\u00e4ndlich zahlt jeder seinen Verzehr \nselber.<\/span><br \/>
 * <span style=\"font-family:arial, helvetica, sans-serif;font-size:small;\">Es
 * wird, im Gegensatz zu fr\u00fcher, keine Adresse mehr hier \nangegeben. Wir
 * wollen schlie\u00dfich Geocachen und nicht Taxi fahren :)<\/span><\/p>\n
 * <p style=\"text-align:center;\">
 * <br \/>
 * <span style=\"font-family:arial, helvetica,
 * sans-serif;font-size:small;\">Hinweis: Wir treffen uns <strong>an jedem
 * ersten Dienstag eines Monats<\/strong> um jeweils<strong> 18:00 Uhr
 * <\/strong>an obrigen Koordinaten<strong>.<\/strong><\/span><\/p>\n
 * <p style=\"text-align:center;\">
 * <span style=\"font-family:arial, helvetica, sans-serif;\"><span
 * style=\"font-size:small;\">Bitte meldet Eure Teilnahme unter \"Log
 * eintragen\" bei \"Art des Logeintrages:\" mit der Auswahl \"m\u00f6chte
 * teilnehmen\" an.<strong><\/strong><\/span><strong><br \/>
 * <\/strong><\/span><\/p>\n
 * <p>
 * <em>&copy; <a href='http:\/\/www.opencaching.de\/viewprofile.php?userid=280542'>Linusus<\/a>, <a href='http:\/\/www.opencaching.de\/viewcache.php?cacheid=179199'>Opencaching.de<\/a>, <a href='http:\/\/creativecommons.org\/licenses\/by-nc-nd\/3.0\/de\/'>CC-BY-NC-ND<\/a>, Stand: 13.01.2016; alle Logeintr\u00e4ge &copy; jeweiliger Autor<\/em><\/p>","hint2":"","images":[{"uuid":"14C533A7-B182-11E5-8C61-161743884843","url":"http:\/\/www.opencaching.de\/images\/uploads\/14C533A7-B182-11E5-8C61-161743884843.png","thumb_url":"http:\/\/www.opencaching.de\/thumbs.php?type=2&uuid=14C533A7-B182-11E5-8C61-161743884843","caption":"OC-Stammtisch D\u00fcsseldorf","unique_caption":"1","is_spoiler":false}],"preview_image":{"uuid":"14C533A7-B182-11E5-8C61-161743884843","url":"http:\/\/www.opencaching.de\/images\/uploads\/14C533A7-B182-11E5-8C61-161743884843.png","thumb_url":"http:\/\/www.opencaching.de\/thumbs.php?type=2&uuid=14C533A7-B182-11E5-8C61-161743884843","caption":"OC-Stammtisch D\u00fcsseldorf","unique_caption":"1","is_spoiler":false},"attr_acodes":["A1","A33","A35","A36","A37","A31","A40","A45"],"latest_logs":[{"uuid":"65e0aa0c-6e6d-42f5-936f-d0adda69b454","date":"2016-01-05T19:00:29+01:00","user":{"uuid":"b61236ce-ffd3-102c-a922-00163e38b4cf","username":"K\u00f6nig Moderig","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=161483"},"type":"Attended","comment":"Ich habe es tats\u00e4chlich geschafft!<br \/>\n<br \/>\nUnd es war seit Langem der erste Stammtisch, bei dem mich nicht am Ende irgendwas abgef... hat ;).<br \/>\n<br \/>\nAlso bis zum n\u00e4chsten Mal!<br \/>\n<br \/>\nTFTC an Linusus,<br \/>\nK\u00f6nig Moderig (Nik)"},{"uuid":"86fb3e43-b79c-11e5-8c61-161743884843","date":"2016-01-05T18:30:00+01:00","user":{"uuid":"ef45ef24-f619-11e1-aae3-00163e0af0a3","username":"clanfamily","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=244244"},"type":"Will attend","comment":"<p>In \u00fcberschaubarer Runde haben wir das neue Jahr begr\u00fc\u00dft.<\/p>\n<p>Bei leckrem Essen und Kaltgetr\u00e4nken enrspannt den Abend genossen. Schade, dass nicht alle \"m\u00f6chte teilnehmen\" da waren. H\u00e4tte mich gefreut euch mal zu sehen.<\/p>\n<p>Gr\u00fc\u00dfe an K\u00f6nigModerig und die Gastgeber<\/p>\n<p>Gr\u00fc\u00dfe fein vom Niederrhein,<\/p>\n<p>Clanfamily-Mirco<\/p>"},{"uuid":"f69d073f-b3b8-11e5-8c61-161743884843","date":"2016-01-05T00:00:00+01:00","user":{"uuid":"b61236ce-ffd3-102c-a922-00163e38b4cf","username":"K\u00f6nig Moderig","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=161483"},"type":"Will attend","comment":"Ich komme vorbei!<br \/>\r\n<br \/>\r\n(Vorrausgesetzt, ich versacke nicht vorher irgendwo ;))"},{"uuid":"4bd7a666-b312-11e5-8c61-161743884843","date":"2016-01-04T00:00:00+01:00","user":{"uuid":"ef45ef24-f619-11e1-aae3-00163e0af0a3","username":"clanfamily","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=244244"},"type":"Will attend","comment":"<p>So wie es aussieht ist mit mir mal wieder zu rechnen.<\/p>\n<p>Freue mich auf euch!<\/p>"},{"uuid":"9e02a5cd-b222-11e5-8c61-161743884843","date":"2016-01-03T00:00:00+01:00","user":{"uuid":"ffa8af34-82d7-11e5-a57d-525400e33611","username":"dape16","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=323452"},"type":"Will attend","comment":"<p>Ich werde versuchen auch vorbeizukommen. Bisher bin ich noch nicht so viel bei Opencaching aktiv, will das aber \u00e4ndern :)<\/p>"},{"uuid":"02079892-b24a-11e5-8c61-161743884843","date":"2016-01-03T00:00:00+01:00","user":{"uuid":"d215c242-3b1a-11e4-a39c-525400e33611","username":"biancache75","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=308836"},"type":"Will attend","comment":""},{"uuid":"2e5ed230-5680-4556-86c2-67e1e75ae065","date":"2016-01-02T23:09:21+01:00","user":{"uuid":"886c02c8-6f71-11e0-b2ac-00163e3ac09b","username":"Lineflyer","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=202498"},"type":"Will attend","comment":"Hallo und frohes Neues!<br \/>\nIch werd versuchen zu kommen, wei\u00df allerdings noch nicht ob es klappt, da ich noch nicht absehen kann, was die Arbeit im neuen Jahr sch\u00f6nes beschert.<br \/>\n<br \/>\n<br \/>\nLogged with c:geo for Android - www.cgeo.org"},{"uuid":"62a6315a-b171-11e5-8c61-161743884843","date":"2016-01-02T00:00:00+01:00","user":{"uuid":"33c32c38-3f3a-11e3-8369-525400a7f25b","username":"Linusus","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=280542"},"type":"Will attend","comment":"<p>Werde nat\u00fcrlich teilnehmen<\/p>"},{"uuid":"b1f6b961-b17b-11e5-8c61-161743884843","date":"2016-01-02T00:00:00+01:00","user":{"uuid":"81a24452-b8ed-11e3-b952-525400e33611","username":"Ela83","profile_url":"http:\/\/www.opencaching.de\/viewprofile.php?userid=298943"},"type":"Will attend","comment":"<p>Komme auch.<\/p>\n<p>Freue mich auf alle<\/p>\n<p>Gr\u00fc\u00dfe, Ela83<\/p>"}],"trackables":[],"trackables_count":0,"alt_wpts":[],"country":"Germany","state":"Nordrhein-Westfalen","protection_areas":[]} *
 *
 * @author Jörg Friebel
 * @since 12.01.2016
 */

public class OcGetGeocacheFullService extends OcService
{
	@Override
	protected OcMethod getOcMethod()
	{
		return OcMethod.CACHES_GEOCACHE;
	}

	public OcGeocacheFull getJsonObject(String aJsonString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(aJsonString, OcGeocacheFull.class);
		}
		catch (JsonParseException e)
		{
			throw new RuntimeException(e);
		}
		catch (JsonMappingException e)
		{
			throw new RuntimeException(e);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
}
