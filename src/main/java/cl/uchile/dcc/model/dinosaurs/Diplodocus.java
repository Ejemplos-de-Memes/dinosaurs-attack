package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractHerbivorous;

public class Diplodocus extends AbstractHerbivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public Diplodocus(int attack, int hp) {
    super(attack, hp);
  }
}
