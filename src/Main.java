public class Main {
  public static void main(String[] args) {
    // Create Car object
    Car car = new Car("Toyota", "Corolla", 2020, 4);
    car.describe();
    car.startEngine();
    car.honk();

    System.out.println();

    // Create Bike object
    Bike bike = new Bike("Giant", "Escape", 2019, "Mountain");
    bike.describe();
    bike.startEngine();
    bike.ringBell();

    System.out.println();

    // Demonstrate encapsulation
    car.setMake("Honda");
    car.setModel("Civic");
    car.setYear(2022);
    car.setNumberOfDoors(2);
    car.describe();
  }
}
