package thegeocacher.oc.services.caches.geocache.full;

import org.junit.Test;

import thegeocacher.domain.attribute.GeocacheCode;
import static org.junit.Assert.*;

/**
 *
 * @author Jörg Friebel
 * @since 13.01.2016
 */
public class OcGetGeocacheFullServiceTest
{

	@Test
	public void testGetJsonObject()
	{
		OcGetGeocacheFullService serviceUnderTest = new OcGetGeocacheFullService();
		String jsonString = "{"
				+ "\"code\":\"OC1294E\","
				+ "\"names\":{\"de\":\"OC-Stammtisch D\\u00fcsseldorf 16\\/01\"},"
				+ "\"location\":\"51.226967|6.774383\","
				+ "\"type\":\"Event\","
				+ "\"status\":\"Available\","
				+ "\"gc_code\":null,"
				+ "\"founds\":1,"
				+ "\"notfounds\":0,"
				+ "\"willattends\":8,"
				+ "\"size2\":\"none\","
				+ "\"difficulty\":1,"
				+ "\"terrain\":1,"
				+ "\"trip_time\":null,"
				+ "\"trip_distance\":null,"
				+ "\"rating\":null,"
				+ "\"rating_votes\":0,"
				+ "\"recommendations\":0,"
				+ "\"req_passwd\":false,"
				+ "\"last_found\":\"2016-01-05T00:00:00+01:00\","
				+ "\"last_modified\":\"2016-01-02T19:53:15+01:00\","
				+ "\"date_created\":\"2016-01-02T17:39:37+01:00\","
				+ "\"date_hidden\":\"2016-01-05T00:00:00+01:00\","
				+ "\"owner\":{\"uuid\":\"33c32c38-3f3a-11e3-8369-525400a7f25b\",\"username\":\"Linusus\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=280542\"},"
				+ "\"is_found\":false,"
				+ "\"is_not_found\":false,"
				+ "\"short_descriptions\":{\"de\":\"Der Geocaching-Stammtisch f\\u00fcr D\\u00fcsseldorf und Umgebung\"},"
				+ "\"descriptions\":{\"de\":\"<p style=\\\"text-align:center;\\\"><span style=\\\"font-family:arial, helvetica, sans-serif;font-size:small;\\\">Der Geocaching-Stammtisch f\\u00fcr alle die gerne Gleichgesinnte treffen.<\\/span><\\/p>\\n<p style=\\\"text-align:center;\\\"><span style=\\\"font-family:arial, helvetica, sans-serif;font-size:small;\\\">Es ist dabei egal ob ihr Alt-Cacher, Jung-Cacher, Neu-Cacher, Mehrfach-Listing-Cacher oder sonstwie geartete Cacher seit. :)<\\/span><\\/p>\\n<p style=\\\"text-align:center;\\\"><span style=\\\"font-family:arial, helvetica, sans-serif;font-size:small;\\\">Nach\\n jetzt anderthalb Jahren mit nur einem Listing f\\u00fcr unseren monatlichen \\nStammtisch haben wir uns bei unserem Dezember-Treffen entschieden f\\u00fcr jeden ersten Dienstag im Monat \\nein eigenes Listing zu erstellen.<\\/span><\\/p>\\n<p style=\\\"text-align:center;\\\"><span style=\\\"font-family:arial, helvetica, sans-serif;font-size:small;\\\">Der Stammtisch wird \\\"indoor\\\" durchgef\\u00fchrt. \\nDie Position zeigt auf eine Lokalit\\u00e4t in der mindestens Getr\\u00e4nke \\nausgesch\\u00e4nkt werden. Selbstverst\\u00e4ndlich zahlt jeder seinen Verzehr \\nselber.<\\/span><br \\/><span style=\\\"font-family:arial, helvetica, sans-serif;font-size:small;\\\">Es wird, im Gegensatz zu fr\\u00fcher, keine Adresse mehr hier \\nangegeben. Wir wollen schlie\\u00dfich Geocachen und nicht Taxi fahren :)<\\/span><\\/p>\\n<p style=\\\"text-align:center;\\\"><br \\/><span style=\\\"font-family:arial, helvetica, sans-serif;font-size:small;\\\">Hinweis: Wir treffen uns <strong>an jedem ersten Dienstag eines Monats<\\/strong> um jeweils<strong> 18:00 Uhr <\\/strong>an obrigen Koordinaten<strong>.<\\/strong><\\/span><\\/p>\\n<p style=\\\"text-align:center;\\\"><span style=\\\"font-family:arial, helvetica, sans-serif;\\\"><span style=\\\"font-size:small;\\\">Bitte meldet Eure Teilnahme unter \\\"Log eintragen\\\" bei \\\"Art des Logeintrages:\\\" mit der Auswahl \\\"m\\u00f6chte teilnehmen\\\" an.<strong><\\/strong><\\/span><strong><br \\/><\\/strong><\\/span><\\/p>\\n<p><em>&copy; <a href='http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=280542'>Linusus<\\/a>, <a href='http:\\/\\/www.opencaching.de\\/viewcache.php?cacheid=179199'>Opencaching.de<\\/a>, <a href='http:\\/\\/creativecommons.org\\/licenses\\/by-nc-nd\\/3.0\\/de\\/'>CC-BY-NC-ND<\\/a>, Stand: 14.01.2016; alle Logeintr\\u00e4ge &copy; jeweiliger Autor<\\/em><\\/p>\"},"
				+ "\"hints2\":{},"
				+ "\"images\":[{\"uuid\":\"14C533A7-B182-11E5-8C61-161743884843\",\"url\":\"http:\\/\\/www.opencaching.de\\/images\\/uploads\\/14C533A7-B182-11E5-8C61-161743884843.png\",\"thumb_url\":\"http:\\/\\/www.opencaching.de\\/thumbs.php?type=2&uuid=14C533A7-B182-11E5-8C61-161743884843\",\"caption\":\"OC-Stammtisch D\\u00fcsseldorf\",\"unique_caption\":\"1\",\"is_spoiler\":false}],\"preview_image\":{\"uuid\":\"14C533A7-B182-11E5-8C61-161743884843\",\"url\":\"http:\\/\\/www.opencaching.de\\/images\\/uploads\\/14C533A7-B182-11E5-8C61-161743884843.png\",\"thumb_url\":\"http:\\/\\/www.opencaching.de\\/thumbs.php?type=2&uuid=14C533A7-B182-11E5-8C61-161743884843\",\"caption\":\"OC-Stammtisch D\\u00fcsseldorf\",\"unique_caption\":\"1\",\"is_spoiler\":false},"
				+ "\"attr_acodes\":[\"A1\",\"A33\",\"A35\",\"A36\",\"A37\",\"A31\",\"A40\",\"A45\"],"
				+ "\"latest_logs\":[{\"uuid\":\"b224de3b-b921-11e5-8c28-568baadf70bf\",\"cache_code\":\"OC3A1E\",\"date\":\"2015-07-22T00:00:00+02:00\",\"user\":{\"uuid\":\"1f5361b4-a5fa-11df-acd8-00163e490934\",\"username\":\"wasservogel\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=184231\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p><span id=\\\"custom_ctl00_ContentBody_LogBookPanel1_LogText\\\">Das Tor war gut zu finden, der Petling ist aber nicht mehr vorhanden. Troetzdem eine sch\\u00f6ne Idee. Das ZDF mal von einer anderen Seite. Die Wiese hinter dem Tor macht einen \\u00d6ko-Eindruck. Hier hat lange keiner mehr gem\\u00e4ht.<br \\/><br \\/>T4TC<br \\/><br \\/>wasservogel<\\/span><\\/p>\",\"images\":[{\"uuid\":\"C6AC61BD-B921-11E5-8C28-568BAADF70BF\",\"url\":\"http:\\/\\/www.opencaching.de\\/images\\/uploads\\/C6AC61BD-B921-11E5-8C28-568BAADF70BF.jpg\",\"thumb_url\":\"http:\\/\\/www.opencaching.de\\/thumbs.php?type=1&uuid=C6AC61BD-B921-11E5-8C28-568BAADF70BF\",\"caption\":\"Das Tor\",\"is_spoiler\":false}],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"6e058c50-e810-43d4-b8e6-cb9069434336\",\"cache_code\":\"OC3A1E\",\"date\":\"2015-07-11T15:41:30+02:00\",\"user\":{\"uuid\":\"4fb2be44-d970-11e1-a758-00163e0af0a3\",\"username\":\"staherrmann\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=240907\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"Das Tor konnte ich finden, auch etwas Gr\\u00fcn neben dem Tor, aber der Petling blieb verborgen. Aber Online Log mit Tor erlaubt. \",\"images\":[{\"uuid\":\"99F428A6-2857-11E5-AA46-525400E33611\",\"url\":\"http:\\/\\/www.opencaching.de\\/images\\/uploads\\/99F428A6-2857-11E5-AA46-525400E33611.jpg\",\"thumb_url\":\"http:\\/\\/www.opencaching.de\\/thumbs.php?type=1&uuid=99F428A6-2857-11E5-AA46-525400E33611\",\"caption\":\"Fotolog\",\"is_spoiler\":false}],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"6c66b89c-f679-11e3-a0f2-525400e33611\",\"cache_code\":\"OC3A1E\",\"date\":\"2014-06-12T07:00:00+02:00\",\"user\":{\"uuid\":\"13f16668-de86-11e3-a0f2-525400e33611\",\"username\":\"tzsMeenz\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=302655\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p>Das Tor war gut zu finden (Was ist daran eigentlich Mystery?) aber der PETling hat sich ganz gut versteckt!<\\/p>\\n<p>TFTC!<\\/p>\",\"images\":[],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"3311b640-cf60-11e3-a0f2-525400e33611\",\"cache_code\":\"OC3A1E\",\"date\":\"2014-04-29T00:00:00+02:00\",\"user\":{\"uuid\":\"AC23A5C6-B06F-C8E0-1091-E9BDFE494997\",\"username\":\"Sturnus Canus\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=108630\"},\"type\":\"Ready to search\",\"was_recommended\":false,\"comment\":\"<p>frisch gewartet <\\/p>\",\"images\":[],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"869b247e-a82b-11e3-b952-525400e33611\",\"cache_code\":\"OC3A1E\",\"date\":\"2014-03-10T00:00:00+01:00\",\"user\":{\"uuid\":\"AC23A5C6-B06F-C8E0-1091-E9BDFE494997\",\"username\":\"Sturnus Canus\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=108630\"},\"type\":\"Archived\",\"was_recommended\":false,\"comment\":\"\",\"images\":[],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"a2a8fada-1d32-11e3-8e4e-525400a7f25b\",\"cache_code\":\"OC3A1E\",\"date\":\"2013-09-03T00:00:00+02:00\",\"user\":{\"uuid\":\"225f1162-1c7d-11e3-8e4e-525400a7f25b\",\"username\":\"MZ94\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=272858\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p>Auf einer\\u00a0Radtour schnell gefunden. Leider kein Bild, mein Handy kann sich nicht selbst fotografieren...<\\/p>\\n<p>DfdC<\\/p>\",\"images\":[],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"58825c9e-e966-11e2-a1c3-525400a7f25b\",\"cache_code\":\"OC3A1E\",\"date\":\"2012-12-24T16:36:00+01:00\",\"user\":{\"uuid\":\"640c4a92-5bed-11e0-b2ac-00163e3ac09b\",\"username\":\"Fassenachterin\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=199903\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p><span style=\\\"font-family:&quot;comic sans ms&quot;, sans-serif;font-size:small;\\\">Auf dem Weg \\\"Driving \\nhome for Christmas\\\" habe ich nach der Letterbox, dem Luftschlo\\u00df, dem \\nTradi \\\"Sch\\u00f6ne Zeiten\\\" noch das ZDF-Tor gesucht. Dieser Mystery stand \\nschon lange auf der Liste. Auch wu\\u00dfte ich ungef\\u00e4hr wo das Tor zu finden \\nist, aber leider ergab sich vorher nie die Gelegenheit mal hier einen \\nSpaziergang zu unternehmen. Den Petling habe ich nach ein paar Minuten \\nSuchen gefunden und erst hinterher den Hint gelesen<\\/span><\\/p>\",\"images\":[{\"uuid\":\"7E0609B6-E966-11E2-A1C3-525400A7F25B\",\"url\":\"http:\\/\\/www.opencaching.de\\/images\\/uploads\\/7E0609B6-E966-11E2-A1C3-525400A7F25B.jpg\",\"thumb_url\":\"http:\\/\\/www.opencaching.de\\/thumbs.php?type=1&uuid=7E0609B6-E966-11E2-A1C3-525400A7F25B\",\"caption\":\"Logproof Hoeckers ZDF Cache\",\"is_spoiler\":true}],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"cc5a57ee-09af-11e2-aae3-00163e0af0a3\",\"cache_code\":\"OC3A1E\",\"date\":\"2012-09-23T00:00:00+02:00\",\"user\":{\"uuid\":\"a3fefb46-750e-11e1-a3f2-00163e239302\",\"username\":\"Hiema_MZ\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=228573\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p><span>Cooler Cache ... Danke daf\\u00fcr <img src=\\\"http:\\/\\/www.geocaching.com\\/images\\/icons\\/icon_smile.gif\\\" border=\\\"0\\\" alt=\\\"\\\" align=\\\"middle\\\" \\/><\\/span><\\/p>\",\"images\":[{\"uuid\":\"363BD5AC-09B0-11E2-AAE3-00163E0AF0A3\",\"url\":\"http:\\/\\/www.opencaching.de\\/images\\/uploads\\/363BD5AC-09B0-11E2-AAE3-00163E0AF0A3.jpg\",\"thumb_url\":\"http:\\/\\/www.opencaching.de\\/thumbs.php?type=1&uuid=363BD5AC-09B0-11E2-AAE3-00163E0AF0A3\",\"caption\":\"Das Tor ...\",\"is_spoiler\":false}],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"47b8bafa-975a-11e3-b952-525400e33611\",\"cache_code\":\"OC3A1E\",\"date\":\"2012-04-29T00:00:00+02:00\",\"user\":{\"uuid\":\"85107e00-af21-11e2-b734-525400a7f25b\",\"username\":\"joeheinous\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=257555\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p>Mein erster Fund. Leider gleich was zu schreiben vergessen. Na ja, sind ja noch ein paar Caches in der N\\u00e4he. Dann komme ich noch mal f\\u00fcrs loggen vorbei.<\\/p>\",\"images\":[],\"oc_team_entry\":false},"
				+ "{\"uuid\":\"feeb446e-fda0-11e0-a3f2-00163e239302\",\"cache_code\":\"OC3A1E\",\"date\":\"2011-10-23T00:00:00+02:00\",\"user\":{\"uuid\":\"a57adda6-25d8-102b-9493-00163e103232\",\"username\":\"ColleIsarco\",\"profile_url\":\"http:\\/\\/www.opencaching.de\\/viewprofile.php?userid=124818\"},\"type\":\"Found it\",\"was_recommended\":false,\"comment\":\"<p>Gedacht war das eher als Abschluss meiner kleinen Tradirunde am\\nLerchenberg, aber als l\\u00e4ngs des Weges ging, dachte ich mir: Hier k\\u00f6nnte\\ner sein. Und damit war das Jagdfieber er\\u00f6ffnet. Also mal kurz\\numgeschaut, nachgedacht und dann mit gekonnten Cacherblick gesehen.<br \\/><br \\/>TFTC<\\/p>\",\"images\":[],\"oc_team_entry\":false}],"
				+ "\"trackables\":[{\"code\":\"GKA612\",\"name\":\"Sandschaufel 2\",\"url\":\"http:\\/\\/geokrety.org\\/konkret.php?id=42514\"}],"
				+ "\"trackables_count\":0,"
				+ "\"alt_wpts\":[{\"name\":\"OC11616-1\",\"location\":\"51.138933|7.156017\",\"type\":\"parking\",\"type_name\":\"Parking\",\"sym\":\"Parking Area\",\"description\":\" hier kann man kostenlos parken, direkt am Cache sind die Parkpl\\u00e4tze kostenpflichtig \"}],"
				+ "\"country\":\"Germany\","
				+ "\"state\":\"Nordrhein-Westfalen\","
				+ "\"protection_areas\":[{\"type\":\"Naturschutzgebiet\",\"name\":\"NSG Grube 7 und ehemaliger Klaerteich\"}]"
				+ "}";

		OcGeocacheFull result = serviceUnderTest.getJsonObject(jsonString);
		assertEquals("OC1294E", result.code);
		assertEquals("de", result.names.getLanguageTexts().get(0).languageIsoCode);
		assertEquals("OC-Stammtisch Düsseldorf 16/01", result.names.getLanguageTexts().get(0).text);
	}

	@Test
	public void tesGettUrl()
	{
		OcGetGeocacheFullService serviceUnderTest = new OcGetGeocacheFullService();
		OcGetGeocacheFullParameters parameters = new OcGetGeocacheFullParameters();

		parameters.setCacheCode(new GeocacheCode("OC1294E"));
		String result = serviceUnderTest.getUrl(parameters);

		String expectedResult = "http://www.opencaching.de/okapi/services/caches/geocache?"
				+ "consumer_key=f8k87aHFAVaCn5K9gAeM&"
				+ "log_fields=uuid%7Cdate%7Cuser%7Ctype%7Ccomment%7Coc_team_entry%7Cwas_recommended%7Ccache_code%7Cimages&"
				+ "attribution_append=none&"
				+ "user_uuid=A266282E-3EA9-6FDC-9451-27BD5C67AC65&"
				+ "fields=code%7Cnames%7Clocation%7Ctype%7Cstatus%7Cowner%7Cgc_code%7Cis_found%7Cis_not_found%7Cfounds%7Cnotfounds%7Cwillattends%7Csize2%7Cdifficulty%7Cterrain%7Ctrip_time%7Ctrip_distance%7Crating%7Crating_votes%7Crecommendations%7Creq_passwd%7Cshort_description%7Cdescription%7Chint2%7Cimages%7Cpreview_image%7Cattr_acodes%7Clatest_logs%7Ctrackables_count%7Ctrackables%7Calt_wpts%7Ccountry%7Cstate%7Cprotection_areas%7Clast_found%7Clast_modified%7Cdate_created%7Cdate_hidden&"
				+ "cache_code=OC1294E";

		assertEquals(expectedResult, result);
	}
}
