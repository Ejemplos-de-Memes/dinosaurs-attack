package cl.uchile.dcc.model.factories.food;

import cl.uchile.dcc.model.items.Herb;
import java.util.HashMap;
import java.util.Map;

public class HerbFlyweightFactory {

  private Map<Integer, Herb> cache = new HashMap<>();

  public Herb create(Herb herb) {
    int hashC = herb.hashCode();
    if (!cache.containsKey(hashC)) {
      cache.put(hashC, herb);
    }
    return cache.get(hashC);
  }

  public Herb create(int hpToCure, int atkToIn) {
    return create(new Herb(hpToCure));
  }

}
