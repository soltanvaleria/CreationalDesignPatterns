package org.abstractFactory;

public class ElectricMusicalInstruments implements MusicalInstruments{

  @Override
  public Piano createPiano() {

    return new ElectricPiano();
  }

  @Override
  public Guitar createGuitar() {

    return new ElectricGuitar();
  }
}
