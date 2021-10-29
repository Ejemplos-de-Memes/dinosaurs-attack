package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.dinosaurs.Triceratops;
import cl.uchile.dcc.model.dinosaurs.Velociraptor;

public interface AttackedByAVelociraptor extends Dinosaur {

  /**
   * To use Double Dispatch in attack
   * @param velociraptor a Velociraptor
   */
  void attackedByVelociraptor(Velociraptor velociraptor);

}
