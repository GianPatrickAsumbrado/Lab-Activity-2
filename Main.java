public class Main{
    public static void main(String[] args){

        Vehicle v1 = new Vehicle("Nissan", "Terra", 2022);
        
        Vehicle v2 = new Vehicle("Mercedes-Benz", "C-Class", 2023);

        Vehicle v3 = new Vehicle("Honda", "Civic", 1720);

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vinatage: " + v1.isVintage());
        v1.setYear(1976);

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vinatage: " + v2.isVintage());
        v2.setYear(2007);

        
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vinatage: " + v3.isVintage());
        v3.setYear(1993);

    }
}       