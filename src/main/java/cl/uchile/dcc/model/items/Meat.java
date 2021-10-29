package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Meat extends AbstractFood {

  private int hpToCure;
  private int atkToIncrease;

  public Meat(int hpToCure, int atkToIncrease) {
    this.hpToCure = hpToCure;
    this.atkToIncrease = atkToIncrease;
  }

  @Override
  public void updateHp(Dinosaur dinosaur) {
    dinosaur.increaseHp(hpToCure);
  }

  @Override
  public void updateAttack(Dinosaur dinosaur) {
    dinosaur.increaseAttack(atkToIncrease);
  }
}
