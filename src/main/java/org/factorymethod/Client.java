package org.factorymethod;

import java.util.Scanner;

public class Client {

  public static void main(String[] args) throws Exception {
    AnimalFactory animalFactory = null;
    System.out.println("Enter what animal you want to hear");
    System.out.println("Dog");
    System.out.println("Cat");
    Scanner in = new Scanner(System.in);
    String choice = in.nextLine();
    if(choice.equalsIgnoreCase("Dog"))
    {
      animalFactory = new DogFactory();
    } else if (choice.equalsIgnoreCase("Cat")) {
      animalFactory = new CatFactory();
    }
      else throw new Exception ("No such element!");

      animalFactory.createAnimal().makeSound();

  }

}
