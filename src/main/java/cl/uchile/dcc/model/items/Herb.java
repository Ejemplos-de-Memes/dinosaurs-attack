package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Herb extends AbstractFood implements VegetarianFood {

  private final int hpToCure;

  public Herb(int hpToCure) {
    this.hpToCure = hpToCure;
  }

  @Override
  public void updateHp(Dinosaur dinosaur) {
    dinosaur.increaseHp(hpToCure);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Herb herb)) {
      return false;
    }

    return hpToCure == herb.hpToCure;
  }

  @Override
  public int hashCode() {
    return hpToCure;
  }
}
