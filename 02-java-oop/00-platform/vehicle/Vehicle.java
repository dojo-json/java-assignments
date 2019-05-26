public class Vehicle {
  private int numberOfWheels;
  private String color;

  Vehicle() {
  }

  Vehicle(String color) {
    this.color = color;
  }

  Vehicle(String color, int wheelCount) {
    this.color = color;
    this.numberOfWheels = wheelCount;
  }

  public int getNumberOfWheels() {
    return this.numberOfWheels;
  }

  public void setNumberOfWheels(int number) {
    this.numberOfWheels = number;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
