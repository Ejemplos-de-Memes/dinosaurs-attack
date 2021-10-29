package cl.uchile.dcc.model.factories.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.Diplodocus;
import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.dinosaurs.Triceratops;
import cl.uchile.dcc.model.dinosaurs.Velociraptor;
import cl.uchile.dcc.model.dinosaurs.interfaces.AttackedByAVelociraptor;
import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class RandomAttackableByVelociraptor extends AbstractDinosaurFactory {

  @Override
  public AttackedByAVelociraptor create() {
    double randomNumber = Math.random();
    if (randomNumber < 0.47) {
      return new Diplodocus(getAtk(), getHp());
    } else if (randomNumber < 0.74) {
      return new Triceratops(getAtk(), getHp());
    } else {
      return new TRex(getAtk(), getHp());
    }
  }
}
