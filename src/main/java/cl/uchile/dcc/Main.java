package cl.uchile.dcc;

import cl.uchile.dcc.model.factories.food.FoodFactory;
import cl.uchile.dcc.model.items.Herb;

public class Main {
  public static void main(String[] args){
    System.out.println(FoodFactory.createHerb(new Herb(5)));
  }

}
