public class Truck extends Vehicle {
private int numberofWheels;

   public Truck(String brand, String model, int year, int numbofWheels){
       super(brand, model, year);
       this.numberofWheels = numbofWheels;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Number of wheels: " + numberofWheels);
      }
   }