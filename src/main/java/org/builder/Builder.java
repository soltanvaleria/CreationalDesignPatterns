package org.builder;

public interface Builder {

  void setYear(int year);
  void setBrand(CarBrand brand);
  void setEngine(Engine engine);
  void setNumberOfDoors(int numberOfDoors);
  void setNumberOfSeats(int numberOfSeats);
  Car getCar();
}
