package OOPsConcepts.Inheritance;

public class Car extends Vehicle {
    int numberOfDoors;
    boolean isElectric;

    Car(String name, String model, String color, String engineType, int numberOfDoors, boolean isElectric) {
        super(name, model, color, engineType);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
        // super.displayInfo(); Use any of the parent class methods here if needed using super keyword
    }

    public void ActivateAC() {
        System.out.printf("Activating AC in the car %s %s", name, model);
        System.out.println();
    }

}
