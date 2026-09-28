public class Main{
    public static void main(String[] args){

        Vehicles v1 = new Vehicles("Nissan", "Terra", 2022);
        
        Vehicles v2 = new Vehicles("Mercedes-Benz", "C-Class", 2023);

        Vehicles v3 = new Vehicles("Honda", "Civic", 1992);

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