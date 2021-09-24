package cl.uchile.dcc.model.dinosaurs.abstract_classes;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public abstract class AbstractDinosaur implements Dinosaur {

  private final int attack;
  private int hp;

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp puntos de vida.
   */
  public AbstractDinosaur(int attack, int hp) {
    this.attack = attack;
    this.hp = hp;
  }

}
