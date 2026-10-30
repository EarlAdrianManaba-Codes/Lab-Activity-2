public class  Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type : Car | Doors: " +numberOfDoors);
    }
    
    @Override 
    public void moveForward() {
        System.out.println("A Car Moves Forward");
    }

     @Override 
    public void moveBackwards() {
        System.out.println("A Car Moves Backwards");
    }

     @Override 
    public void moveLeft() {
        System.out.println("A Car Turns Left");
    }

     @Override 
    public void moveRight() {
        System.out.println("A Car Turns Right");
    }
}