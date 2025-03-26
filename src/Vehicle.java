public class Vehicle {
  // Private properties
  private String make;
  private String model;
  private int year;

  // Constructor
  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // Getters
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  // Setters
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // Methods
  public void describe() {
    System.out.println(year + " " + make + " " + model);
  }

  public void startEngine() {
    System.out.println("Engine has started.");
  }
}
