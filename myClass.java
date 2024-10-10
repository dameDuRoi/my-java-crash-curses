// Define a class called 'Car'
public class Car {
    // Fields (attributes) of the class
    private String brand;
    private String model;
    private int year;

    // Constructor: Initializes the attributes of the class
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public String getCarInfo() {
        return year + " " + brand + " " + model;
    }

    // Method to simulate starting the car
    public void start() {
        System.out.println(model + " is starting...");
    }

    // Method to simulate stopping the car
    public void stop() {
        System.out.println(model + " is stopping...");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create an object of the class Car
        Car myCar = new Car("Tesla", "Model S", 2022);

        // Access the methods of the Car class
        System.out.println(myCar.getCarInfo());  // Output: 2022 Tesla Model S
        myCar.start();                          // Output: Model S is starting...
        myCar.stop();                           // Output: Model S is stopping...
    }
}