public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getbrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void displayInfo() {
        System.out.println("Year: " + year + ", brand: " + brand +", Model: " + model);
    }

    public abstract void moveForward();
    public abstract void moveBackwards();
    public abstract void moveLeft();
    public abstract void moveRight();
}