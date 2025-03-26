public class Bike extends Vehicle {
  // Private property
  private String type;

  // Constructor
  public Bike(String make, String model, int year, String type) {
    super(make, model, year);
    this.type = type;
  }

  // Getter
  public String getType() {
    return type;
  }

  // Setter
  public void setType(String type) {
    this.type = type;
  }

  // Overridden describe method
  @Override
  public void describe() {
    System.out.println("Bike: " + getYear() + " " + getMake() + " " + getModel() + ", Type: " + type + ".");
  }

  // Unique method
  public void ringBell() {
    System.out.println("Bike bell is ringing!");
  }
}
