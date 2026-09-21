public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.model = "Corolla";
        v1.year = 2018;

        Vehicle v2 = new Vehicle();
        v2.brand = "Ford";
        v2.model = "Mustang";
        v2.year = 1995;

        Vehicle v3 = new Vehicle();
        v3.brand = "Tesla";
        v3.model = "Model 3";
        v3.year = 2022;

        System.out.println(" Vehicle 1 ");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge() + " years");
        System.out.println("Is Vintage: " + v1.isVintage());
        System.out.println();

        System.out.println(" Vehicle 2 ");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge() + " years");
        System.out.println("Is Vintage: " + v2.isVintage());
        System.out.println();

        System.out.println(" Vehicle 3 ");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge() + " years");
        System.out.println("Is Vintage: " + v3.isVintage());
    }
}