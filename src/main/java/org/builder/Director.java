package org.builder;

public class Director {
  public void buildVolvoCar(Builder builder){
    builder.setYear(2017);
    builder.setNumberOfSeats(4);
    builder.setBrand(CarBrand.Volvo);
    builder.setEngine(new Engine(150, MotorBrand.Volvo));
    builder.setNumberOfDoors(4);
  }

  public void buildToyotaCar(Builder builder){
    builder.setYear(2020);
    builder.setNumberOfDoors(2);
    builder.setEngine(new Engine(200, MotorBrand.Toyota));
    builder.setBrand(CarBrand.Toyota);
    builder.setNumberOfSeats(2);
  }

}
