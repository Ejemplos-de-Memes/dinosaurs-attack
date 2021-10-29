package cl.uchile.dcc.model.food;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class AbstractFood implements Food {

  @Override
  public final void updateStats(Dinosaur dinosaur) {
    updateHP(dinosaur);
    updateAtk(dinosaur);
  }

  public void updateAtk(Dinosaur dinosaur) {

  }

  public void updateHP(Dinosaur dinosaur) {

  }
}
