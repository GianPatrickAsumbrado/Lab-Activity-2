public class Main{
    public static void main(String[] args){

        Vehicles v1 = new Vehicles();
        v1.brand = "Nissan";
        v1.model = "Terra";
        v1.year = 2022;
        

        Vehicles v2 = new Vehicles();
        v2.brand = "Mercedes-Benz";
        v2.model = "C-Class";
        v2.year = 2023;
        v2.displayInfo();

        Vehicles v3 = new Vehicles();
        v3.brand = "Honda";
        v3.model = "Civic";
        v3.year = 1992;
        v2.displayInfo();

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vinatage: " + v1.isVintage());
        System.out.println();

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vinatage: " + v2.isVintage());
        System.out.println();

        
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vinatage: " + v3.isVintage());
        System.out.println();




    }
}