package org.builder;

public class Engine {

  private final int power;
  private final MotorBrand motorBrand;

  public Engine(int power, MotorBrand motorBrand) {
    this.power = power;
    this.motorBrand = motorBrand;
  }

  @Override
  public String toString() {
    return "Engine{" +
        "power=" + power +
        ", motorBrand=" + motorBrand +
        '}';
  }
}
