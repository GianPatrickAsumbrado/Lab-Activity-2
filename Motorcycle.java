public class Motorcycle extends Vehicle implements Serviceable {
private String EngineType;

   public Motorcycle(String brand, String model, int year, String engineType){
       super(brand, model, year);
       this.EngineType = engineType;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Engine Type: " + EngineType);
      }
      
      public void moveForward() {
         System.out.println("The motorcycle is moving forward.");
      }
      public void moveBackward() {
         System.out.println("The motorcycle is moving backward.");
      }
      public void moveLeft() {
         System.out.println("The motorcycle is turning left.");
      }
      public void moveRight() {
         System.out.println("The motorcycle is turning right.");
      }
      public void Service() {
      System.out.println("Motorcycle : inspect the chain and check the brakes.");
   }
   }