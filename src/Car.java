public class Car extends Vehicle {
  // Private property
  private int numberOfDoors;

  // Constructor
  public Car(String make, String model, int year, int numberOfDoors) {
    super(make, model, year);
    this.numberOfDoors = numberOfDoors;
  }

  // Getter
  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  // Setter
  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  // Overridden describe method
  @Override
  public void describe() {
    System.out.println("Car: " + getYear() + " " + getMake() + " " + getModel() + ", " + numberOfDoors + " doors.");
  }

  // Unique method
  public void honk() {
    System.out.println("Car is honking!");
  }
}
