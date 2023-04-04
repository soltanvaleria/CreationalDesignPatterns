package org.abstractFactory;

import java.util.Scanner;

public class Client {

  public static void main(String[] args) throws Exception {

    System.out.println("Pick what kind of instruments you want to play");
    System.out.println("1 - Acoustic");
    System.out.println("2 - Electrical");
    MusicalInstruments musicalInstruments;
    Scanner in = new Scanner(System.in);
    String choice = in.nextLine();

    if (choice.equals("1")) {
      musicalInstruments = new AcousticMusicalInstruments();


    } else if (choice.equals("2")) {

      musicalInstruments = new ElectricMusicalInstruments();

    } else {
      throw new Exception("Error! Try again");
    }

    musicalInstruments.createPiano().play();
    musicalInstruments.createGuitar().play();

  }
}
