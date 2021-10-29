package cl.uchile.dcc.model.factories.food;

import cl.uchile.dcc.model.items.Herb;
import java.util.Map;

public class HerbFlyweightFactory {

  private Map<Integer, Herb> cache;
  private static HerbFlyweightFactory uniqueInstance;

  private HerbFlyweightFactory() { }

  public static HerbFlyweightFactory getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new HerbFlyweightFactory();
    }
    return uniqueInstance;
  }

  public Herb create(Herb herb) {
    if (!cache.containsKey(herb.hashCode())) {
      cache.put(herb.hashCode(), herb);
    }
    return cache.get(herb.hashCode());
  }

  public Herb create(int hpToCure) {
    return create(new Herb(hpToCure));
  }

}
