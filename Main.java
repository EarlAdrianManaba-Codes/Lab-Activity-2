public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota","Corolla",2018);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1995);
        Vehicle v3 = new Vehicle("Tesla", "Model 3", 2022);

        System.out.println("Vehicle 1");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge() + " years");
        System.out.println("Is Vintage: " + v1.isVintage());
        System.out.println();

        System.out.println("Vehicle 2 ");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge() + " years");
        System.out.println("Is Vintage: " + v2.isVintage());
        System.out.println();

        System.out.println("Vehicle 3 ");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge() + " years");
        System.out.println("Is Vintage: " + v3.isVintage());
            }
}