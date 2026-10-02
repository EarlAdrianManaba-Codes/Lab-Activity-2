public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota","Corolla",2018);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1995);
        Vehicle v3 = new Vehicle("Tesla", "Model 3", 2022);
   
        System.out.println("=== Original Vehicles Information ===");

        System.out.println("Vehicle 1:");
        v1.displayInfo();
        System.out.println("Brand:" + v1.getBrand() + ", Model:" + v1.getModel() + ", Year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge() + " years");
        System.out.println("Is Vintage: " + v1.isVintage());
        System.out.println();

        System.out.println("Vehicle2 ");
        v2.displayInfo();
        System.out.println("Brand: " + v2.getBrand() + ", Model: " + v2.getModel() + ", Year: " + v2.getYear());
        System.out.println("Age: " + v2.calculateAge() + " years");
        System.out.println("Is Vintage: " + v2.isVintage());
        System.out.println();

        System.out.println("Vehicle3 ");
        v3.displayInfo();
        System.out.println("Brand: " + v3.getBrand() + ", Model: " + v3.getModel() + ", Year: " + v3.getYear());
        System.out.println("Age: " + v3.calculateAge() + " years");
        System.out.println("Is Vintage: " + v3.isVintage());
        System.out.println();

        System.out.println("===Testing setYear() Validation Sequence ===");

        boolean r1 = v1.setYear(2000);
        System.out.println("setYear(2000):" + r1 + "; year is" + v1.getYear() + "; age " + v1.calculateAge() + "; vintage " + v1.isVintage());
       
        boolean r2 = v1.setYear(1885);
        System.out.println("setYear(1885):" + r2 + "; year is" + v1.getYear() + "; age " + v1.calculateAge() + "; vintage " + v1.isVintage());

        boolean r3 = v1.setYear(2027);
        System.out.println("setYear(2027):" + r3 + "; year is" + v1.getYear() + "; age " + v1.calculateAge() + "; vintage " + v1.isVintage());
        System.out.println();

        System.out.println("=== Testing Constructor Validation ===");

        Vehicle invalid1 = new Vehicle("Chevrolet", "Camaro", 1885);
        System.out.println("New vehicle with year 1885 -> Initial year is " + invalid1.getYear());

        Vehicle invalid2 = new Vehicle("BMW", "M3", 2027);
        System.out.println("New vehicle with year 2027 -> Initial year is " + invalid2.getYear());
                    }
}