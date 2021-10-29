package cl.uchile.dcc.model.factories.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.interfaces.AttackedByAVelociraptor;
import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class RandomAttackableByVelociraptorFactory extends AbstractRandomFactory {

  @Override
  public AttackedByAVelociraptor create() {
    double randomNumber = Math.random();

    return null;
  }
}
