package org.abstractFactory;

public class AcousticMusicalInstruments implements MusicalInstruments {

  @Override
  public Piano createPiano() {

    return new AcousticPiano();
  }

  @Override
  public Guitar createGuitar() {

    return new AcousticGuitar();
  }
}
