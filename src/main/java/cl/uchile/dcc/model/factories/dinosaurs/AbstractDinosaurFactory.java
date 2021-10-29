package cl.uchile.dcc.model.factories.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public abstract class AbstractDinosaurFactory {
  private int hp;
  private int atk;

  public AbstractDinosaurFactory() {
    this.hp = 25;
    this.atk = 10;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getHp() {
    return hp;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public int getAtk() {
    return atk;
  }

  public abstract Dinosaur create();
}
