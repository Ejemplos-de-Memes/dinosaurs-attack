package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.items.VegetarianFood;

public interface Herbivorous extends Dinosaur, AttackedByAVelociraptor {

  void eatFood(VegetarianFood food);

}
