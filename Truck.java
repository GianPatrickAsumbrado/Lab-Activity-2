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

      public void moveForward() {
         System.out.println("The truck is moving forward.");
      }
      public void moveBackward() {
         System.out.println("The truck is moving backward.");
      }
      public void moveLeft() {
         System.out.println("The truck is turning left.");
      }
      public void moveRight() {
         System.out.println("The truck is turning right.");
      }
   }