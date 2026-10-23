public class Car extends Vehicle {
private int numberofDoors;

   public Car (String brand, String model, int year, int numbofDoors){
       super(brand, model, year);
       this.numberofDoors = numbofDoors;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Number of Doors: " + numberofDoors);
      }
   }