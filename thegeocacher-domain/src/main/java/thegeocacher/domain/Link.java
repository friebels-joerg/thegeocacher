package thegeocacher.domain;

import java.util.List;

import thegeocacher.domain.attribute.LinkId;
import thegeocacher.domain.attribute.LinkName;
import thegeocacher.domain.attribute.LinkType;

/**
 *
 * @author Jörg Friebel
 * @since 15.01.2015
 */
public class Link
{
	LinkId id;
	LinkName name;
	LinkType type;
	List<Geocache> geocaches;
}
