package cl.uchile.dcc.model.factories.food;

import cl.uchile.dcc.model.items.Herb;
import cl.uchile.dcc.model.items.Meat;
import java.util.HashMap;
import java.util.Map;

public class MeatFlyweightFactory {

  private Map<Integer, Meat> cache = new HashMap<>();
  private static MeatFlyweightFactory uniqueInstance;

  private MeatFlyweightFactory() { }

  public static MeatFlyweightFactory getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new MeatFlyweightFactory();
    }
    return uniqueInstance;
  }

  public Meat create(Meat meat) {
    if (!cache.containsKey(meat.hashCode())) {
      cache.put(meat.hashCode(), meat);
    }
    return cache.get(meat.hashCode());
  }

  public Meat create(int hpToCure, int atkToIncrease) {
    return create(new Meat(hpToCure, atkToIncrease));
  }

}
