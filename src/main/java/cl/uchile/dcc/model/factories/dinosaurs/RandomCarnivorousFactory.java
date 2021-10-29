package cl.uchile.dcc.model.factories.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.dinosaurs.Velociraptor;
import cl.uchile.dcc.model.dinosaurs.interfaces.Carnivorous;

public class RandomCarnivorousFactory extends AbstractDinosaurFactory {

  @Override
  public Carnivorous create() {
    double randomNumber = Math.random();
    if (randomNumber < 0.77) {
      return new Velociraptor(getAtk(), getHp());
    } else {
      return new TRex(getAtk(), getHp());
    }
  }
}
