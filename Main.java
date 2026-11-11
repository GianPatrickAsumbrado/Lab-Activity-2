public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void performService(Serviceable item) {
        item.Service();
    }

    public static void main(String[] args) {
        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Nissan", "Terra", 2024, 4);
        vehicle.displayInfo();
        System.out.println();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);

        // The Same Variable now Refer to a Motorcycle Object.
        vehicle = new Motorcycle("Honda", "Beat", 2023, "4-stroke, SOHC, air-cooled, single-cylinder");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);

        // DEMO 2: One Method accepts different Vehicle subclasses
        System.out.println("\n === 2. Method Parameter ===");
        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Beat", 2023, "4-stroke, SOHC, single-cylinder");
        Truck truck = new Truck("Mitsubishi", "L300", 2024, 4);
        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        performService(car);
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        performService(motorcycle);
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();
        performService(truck);

        // DEMO 3: One array holds different Vehicle subclasses
        System.out.println("\n === 3. Polymorphic Array ===");
        Vehicle[] vehicles = {
                new Car("Toyota", "Vios", 2024, 4),
                new Motorcycle("Yamaha", "Sniper 155", 2024, "4-stroke, SOHC, liquid-cooled, single-cylinder"),
                new Truck("Volvo", "FM", 2024, 10)
        };

        Serviceable[] serviceables = {
                new Car("Toyota", "Vios", 2024, 4),
                new Motorcycle("Yamaha", "Sniper 155", 2024, "4-stroke, SOHC, liquid-cooled, single-cylinder"),
                new Truck("Volvo", "FM", 2024, 10),
                new Printer()
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
        }
        System.out.println();

        for (Serviceable serviceable : serviceables) {
            performService(serviceable);
        }
    }

}
