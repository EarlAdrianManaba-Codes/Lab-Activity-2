package app; 
 
import contracts.Serviceable; 
import devices.Printer; 
import vehicles.Car; 
import vehicles.Motorcycle; 
import vehicles.Truck; 
import vehicles.Vehicle; 
 
public class Main {

    public static void performService( Serviceable item) {
        item.service();
    }

    public static void printAndMove(Vehicle vehicle) {
        vehicle.displayInfo();

        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();

        System.out.println("------------------");
    }

    public static void main(String[] args) {

        
        Car car = new Car("Toyota", "Tesla", 2026, 4);
        Truck truck = new Truck("Ford", "GMC", 2025, 6);
        Motorcycle motorcycle =
                new Motorcycle("Yamaha", "Honda", 2024, "Modagan");
        Printer printer = new Printer();

        
        Serviceable[] items = {
            car, motorcycle, truck, printer
        };

        for (Serviceable item : items) {
            performService(item);
        }

        System.out.println("===================");

       
        Vehicle[] vehicles = {
            car, truck, motorcycle
        };

        for (Vehicle currentVehicle : vehicles) {
            printAndMove(currentVehicle);
        }
    }
}
