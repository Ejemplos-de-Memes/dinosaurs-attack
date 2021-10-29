package cl.uchile.dcc.model.food;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Herb extends AbstractFood {

  private int cantidad;

  public Herb(int cantidad) {
    this.cantidad = cantidad;
  }


  @Override
  public void updateHP(Dinosaur dinosaur) {
    dinosaur.increaseHP(cantidad);
  }
}
