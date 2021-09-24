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

  /**
   * Gets the HP
   * @return the HP
   */
  private int getHp() {
    return hp;
  }

  /**
   * Sets the HP
   * @param hp the HP to set
   */
  private void setHp(int hp) {
    this.hp = hp;
  }

  /**
   * Gets the attack
   * @return the attack
   */
  private int getAttack() {
    return attack;
  }


}
