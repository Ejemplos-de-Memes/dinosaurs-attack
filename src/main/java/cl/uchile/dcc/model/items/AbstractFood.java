package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public abstract class AbstractFood implements Food {

  @Override
  public final void updateStats(Dinosaur dinosaur) {
    updateAttack(dinosaur);
    updateHp(dinosaur);
  }

  public void updateHp(Dinosaur dinosaur) {

  }

  public void updateAttack(Dinosaur dinosaur) {

  }
}
