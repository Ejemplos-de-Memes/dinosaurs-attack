package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Meat extends AbstractFood implements CarnivorousFood {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Meat meat)) {
      return false;
    }

    if (hpToCure != meat.hpToCure) {
      return false;
    }
    return atkToIncrease == meat.atkToIncrease;
  }

  @Override
  public int hashCode() {
    int result = hpToCure;
    result = 31 * result + atkToIncrease;
    return result;
  }
}
