package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Herb extends AbstractFood {

  private final int hpToCure;

  public Herb(int hpToCure) {
    this.hpToCure = hpToCure;
  }

  @Override
  public void updateHp(Dinosaur dinosaur) {
    dinosaur.increaseHp(hpToCure);
  }
}
