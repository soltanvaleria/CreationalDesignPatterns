package org.builder;

public class Car {

  private final int year;
  private final CarBrand brand;
  private final Engine engine;
  private final int numberOfDoors;
  private final int numberOfSeats;


  public Car(int year, CarBrand brand, Engine engine, int numberOfDoors, int numberOfSeats) {
    this.year = year;
    this.brand = brand;
    this.engine = engine;
    this.numberOfDoors = numberOfDoors;
    this.numberOfSeats = numberOfSeats;
  }

  public int getYear() {
    return year;
  }

  public CarBrand getBrand() {
    return brand;
  }

  public Engine getEngine() {
    return engine;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  @Override
  public String toString() {
    return "Car{" +
        "year=" + year +
        ", brand=" + brand +
        ", engine=" + engine +
        ", numberOfDoors=" + numberOfDoors +
        ", numberOfSeats=" + numberOfSeats +
        '}';
  }
}
