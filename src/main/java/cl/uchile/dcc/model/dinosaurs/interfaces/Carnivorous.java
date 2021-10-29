package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.dinosaurs.Triceratops;
import cl.uchile.dcc.model.items.CarnivorousFood;
import cl.uchile.dcc.model.items.VegetarianFood;

public interface Carnivorous extends Dinosaur {

  /**
   * To use Double Dispatch in attack
   * @param triceratops a Triceratops
   */
  void attackedByTriceratops(Triceratops triceratops);

  default void eat(CarnivorousFood food) {
    food.updateStats(this);
  }

}
