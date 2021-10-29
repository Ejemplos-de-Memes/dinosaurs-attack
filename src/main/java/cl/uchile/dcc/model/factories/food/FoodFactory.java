package cl.uchile.dcc.model.factories.food;

import cl.uchile.dcc.model.items.Herb;

/**
 * Utility
 */
public final class FoodFactory {

  private static HerbFlyweightFactory herbFactory = HerbFlyweightFactory.getInstance();

  private FoodFactory() { }

  public static Herb createHerb(Herb herb) {
    return herbFactory.create(herb);
  }

}
