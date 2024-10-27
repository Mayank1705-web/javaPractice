import java.util.*;

class Vehicle{
    private int passenger;
    private double fuleCapacity;
    private double mileage;
    
    // Default constructor
    Vehicle() {
        this.passenger = 0;
        this.fuleCapacity = 0.0;
        this.mileage = 0.0;
    }
    
    // Parameterized constructor
    Vehicle(int passenger, double fuleCapacity, double mileage) {
        this.passenger = passenger;
        this.fuleCapacity = fuleCapacity;
        this.mileage = mileage;
    }
    
    // Method to compute consumption of fule
    double fuelConsumption(double distance) {
        return distance / mileage;
    }
    
    // Method to view field values of vehicle object
    void viewVehicleDetails() {
        System.out.println("Number of passengers: " + passenger);
        System.out.println("Fuel capacity: " + fuleCapacity + " litres");
        System.out.println("Mileage: " + mileage + " km/litre");
    }
    
    public static void main(String[] args) {
        int passenger=0;
        double fuleCapacity=0.0, mileage=0.0;
        Scanner sc = new Scanner(System.in);
        Vehicle car = new Vehicle(passenger, fuleCapacity, mileage);
        System.out.print("Enter number of passengers: ");
        car.passenger = sc.nextInt();
        System.out.print("Enter fuel capacity: ");
        car.fuleCapacity = sc.nextDouble();
        System.out.print("Enter mileage: ");
        car.mileage = sc.nextDouble();
        car.viewVehicleDetails();
        System.out.print("Enter distance to be covered: ");
        double distance = sc.nextDouble();
        double fuelConsumption = car.fuelConsumption(distance);
        System.out.println("Fuel consumption for " + distance + " km: " + fuelConsumption + " litres");
    }
} 
