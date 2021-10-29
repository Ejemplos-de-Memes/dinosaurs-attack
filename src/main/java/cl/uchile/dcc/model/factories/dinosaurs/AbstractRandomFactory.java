package cl.uchile.dcc.model.factories.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public abstract class AbstractRandomFactory {

  private int hp = 25;
  private int atk = 10;

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public int getHp() {
    return hp;
  }

  public int getAtk() {
    return atk;
  }

  abstract public Dinosaur create();

}
