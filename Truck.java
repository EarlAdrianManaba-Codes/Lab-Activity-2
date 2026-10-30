public class Truck extends Vehicle {
    private int wheels;

    public Truck(String brand, String model, int year, int wheels) {
        super(brand, model, year);
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck | Wheels: " + wheels);
    }
    @Override 
    public void moveForward() {
       System.out.println("A Truck moves Forward");
    }
    @Override 
    public void moveBackwards() {
       System.out.println("A Truck moves Backwards");
    }
    @Override 
    public void moveLeft() {
       System.out.println("A Truck moves Left");
    }
    @Override 
    public void moveRight() {
       System.out.println("A Truck moves Right");
    }
}