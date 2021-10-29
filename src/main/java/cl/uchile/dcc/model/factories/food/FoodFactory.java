package cl.uchile.dcc.model.factories.food;

import cl.uchile.dcc.model.items.Herb;
import cl.uchile.dcc.model.items.Meat;

public final class FoodFactory {

  private static final HerbFlyweightFactory herbFactory = HerbFlyweightFactory.getInstance();
  private static final MeatFlyweightFactory meatFactory = MeatFlyweightFactory.getInstance();

  private FoodFactory() { }

  public static Herb createHerb(Herb instance) {
    return herbFactory.create(instance);
  }

  public static Meat createMeat(Meat instance) {
    return meatFactory.create(instance);
  }

  public static Herb createHerb(int hpToCure) {
    return herbFactory.create(hpToCure);
  }

  public static Meat createMeat(int hpToCure, int atkToIncrease) {
    return meatFactory.create(hpToCure, atkToIncrease);
  }

}
