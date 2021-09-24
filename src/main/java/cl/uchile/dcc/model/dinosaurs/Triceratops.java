package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractHerbivorous;

public class Triceratops extends AbstractHerbivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public Triceratops(int attack, int hp) {
    super(attack, hp);
  }
}
