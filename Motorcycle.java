public class Motorcycle extends Vehicle {
    private String status;

    public Motorcycle(String brand, String model, int year, String status) {
        super(brand, model, year);
        this.status = status;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle | Status: " + status);
    }
    @Override 
    public void moveForward() {
        System.out.println("A Motorcycle Moves Forward");
    }
    @Override 
    public void moveBackwards() {
        System.out.println("A Motorcycle Moves Backwards");
    }
    @Override 
    public void moveLeft() {
        System.out.println("A Motorcycle Moves Left");
    }
    @Override 
    public void moveRight() {
        System.out.println("A Motorcycle Moves Right");
    }
}