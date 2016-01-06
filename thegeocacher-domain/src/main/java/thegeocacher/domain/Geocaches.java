package thegeocacher.domain;

import java.io.Serializable;
import java.util.List;

public class Geocaches implements Serializable
{

   List<Geocache> geocaches;

   public void addGeocache(Geocache geocache)
   {
      geocaches.add(geocache);
   }
}
