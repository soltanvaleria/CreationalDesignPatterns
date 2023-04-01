package org.builder;

public class CarBuilder implements Builder{

  private static CarBuilder instance = new CarBuilder();
  private int year;
  private CarBrand brand;
  private Engine engine;
  private int numberOfDoors;
  private int numberOfSeats;

  private CarBuilder(){}

  public static CarBuilder getInstance(){
    return instance;
  }

  @Override
  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public void setBrand(CarBrand brand) {
    this.brand = brand;
  }
  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  @Override
  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  @Override
  public Car getCar() {
    return new Car(this.year, this.brand, this.engine,this.numberOfDoors, this.numberOfSeats);
  }

}
