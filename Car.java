public class Car extends Vehicle implements Serviceable {
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

      public void moveForward() {
         System.out.println("The car is moving forward.");
      }

      public void moveBackward() {
         System.out.println("The car is moving backward.");
      }

      public void moveLeft() {
         System.out.println("The car is turning left.");
      }

      public void moveRight() {
         System.out.println("The car is turning right.");
      }
      
      public void Service() {
        System.out.println("Car: Check the Oil and the Brakes.");
     }
   }