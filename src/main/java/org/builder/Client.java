package org.builder;

public class Client {

  public static void main(String[] args) {
    CarBuilder carBuilder = CarBuilder.getInstance();
    Director director  = new Director();
    director.buildVolvoCar(carBuilder);
    Car volvoCar = carBuilder.getCar();
    director.buildToyotaCar(carBuilder);
    Car toyotaCar = carBuilder.getCar();

    System.out.println(volvoCar.toString());
    System.out.println(toyotaCar.toString());
  }
}
