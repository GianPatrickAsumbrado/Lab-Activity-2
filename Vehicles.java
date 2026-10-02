public class Vehicles{

    String brand;
    String model;
    int year;

    Vehicles(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
        public void displayInfo(){
            System.out.println("Brand: " + brand + " Model: " + model + " Year: " + year);
        }

        public int calculateAge(){
            return 2026 - year;
        }

        public boolean isVintage(){
            return calculateAge() > 25;

        }
        

}