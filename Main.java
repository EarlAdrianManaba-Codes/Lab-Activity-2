public class Main {

    public static void printDetails(Vehicle vehicle ) {
       vehicle.displayInfo();
    }
        // DEMO 1: A parent reference holding a child object
        public static void main(String[] args){
        Vehicle vehicle = new Car("Toyota", "Tesla",2026, 4);
        vehicle.displayInfo();

        System.out.println();

        // 1.1 The same variable now refers to a Truck object.
        vehicle  = new Truck("Ford","GMC",2025, 6);
        vehicle.displayInfo();

        System.out.println();

        // 1.1 The same variable now refers to a Motorcycle object.
        vehicle  = new Motorcycle("Yamaha","Honda",2024,"Modagan");
        vehicle.displayInfo();

        System.out.println();

        // DEMO 2: One method accepts different Vehicle subclasses
        System.out.println("\n=== 2. Method Parameter ===");

        vehicle = new Car("Toyota","Tesla",2026, 4);
        vehicle.displayInfo();

        System.out.println();

        vehicle = new Truck("Ford","GMC", 2025,6);
        vehicle.displayInfo();

        System.out.println();

        vehicle = new Motorcycle("Yamaha", "Honda" , 2024 , "Modagan");
        vehicle.displayInfo();

        System.out.println();

        // DEMO 3: One array holds different Vehicle subclasses
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota","Tesla",2026, 4);
        vehicles[1] = new Truck("Ford","GMC", 2025,6);
        vehicles[2] = new Motorcycle("Yamaha", "Honda" , 2024 , "Modagan");

        for (Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}