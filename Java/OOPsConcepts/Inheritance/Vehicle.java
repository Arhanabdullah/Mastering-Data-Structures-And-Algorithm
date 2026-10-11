package OOPsConcepts.Inheritance;

public class Vehicle {
    String name;
    String model;
    String color;
    String engineType;
    Vehicle(){
        this.name = "";
        this.model = "";
        this.color = "";
        this.engineType = "";
    }
    Vehicle(String name, String model, String color, String engineType) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engineType = engineType;
    }
    void start() {
        System.out.printf("Vehicle %s %s is starting", name, model);
        System.out.println();
    }
    void stop() {
        System.out.printf("Vehicle %s %s is stopping", name, model);
        System.out.println();
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine Type: " + engineType);
    }
}



