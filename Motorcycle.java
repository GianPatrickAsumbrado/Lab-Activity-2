public class Motorcycle extends Vehicle {
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
   }