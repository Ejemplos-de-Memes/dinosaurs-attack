package cl.uchile.dcc.model.factories.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.Diplodocus;
import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.dinosaurs.Triceratops;
import cl.uchile.dcc.model.dinosaurs.Velociraptor;
import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

/**
 * Clase que crea dinosaurios de forma aleatoria.
 *
 * Para usar Factory Pattern.
 */
public class RandomDinosaurFactory extends AbstractDinosaurFactory {
  @Override
  public Dinosaur create() {
    double randomNumber = Math.random();
    if (randomNumber < 0.35) {
      return new Diplodocus(getAtk(), getHp());
    } else if (randomNumber < 0.7) {
      return new Velociraptor(getAtk(), getHp());
    } else if (randomNumber < 0.9) {
      return new Triceratops(getAtk(), getHp());
    } else {
      return new TRex(getAtk(), getHp());
    }
  }
}
