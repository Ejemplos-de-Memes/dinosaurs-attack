package cl.uchile.dcc;

import cl.uchile.dcc.model.factories.food.FoodFactory;

public class Main {
  public static void main(String[] args) {
    System.out.println(FoodFactory.createHerb(10));
  }
}
