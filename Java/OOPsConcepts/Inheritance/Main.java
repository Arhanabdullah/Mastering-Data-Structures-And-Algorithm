package OOPsConcepts.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(" Vehicle", " Model", "Color", "EngineType");
        // vehicle.displayInfo();

        Car car = new Car("Tesla", "Model S", "Blue", "Electric", 4, true);
        car.displayInfo();
        car.start();
        car.ActivateAC();
        car.stop();
    }
    
}
