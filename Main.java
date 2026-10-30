public class Main {

    public static void printAndMove(Vehicle vehicle ) {
       vehicle.displayInfo();

       vehicle.moveForward();
       vehicle.moveBackwards();
       vehicle.moveLeft();
       vehicle.moveRight();

       System.out.println("------------------");
    }
        public static void main(String[] args){
    
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota","Tesla",2026, 4);

        vehicles[1] = new Truck("Ford","GMC", 2025,6);

        vehicles[2] = new Motorcycle("Yamaha", "Honda" , 2024 , "Modagan");

        for (Vehicle currentVehicle : vehicles){
            printAndMove(currentVehicle);
            
        }
    }
}