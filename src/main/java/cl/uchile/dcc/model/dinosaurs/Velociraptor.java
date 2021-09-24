package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractCarnivorous;

public class Velociraptor extends AbstractCarnivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public Velociraptor(int attack, int hp) {
    super(attack, hp);
  }
}
