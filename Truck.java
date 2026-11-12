public class Truck extends Vehicle implements Serviceable {
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
        System.out.println("A Truck Moves Forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A Truck Moves Backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A Truck Moves Left");
    }

    @Override
    public void moveRight() {
        System.out.println("A Truck Moves Right");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}
