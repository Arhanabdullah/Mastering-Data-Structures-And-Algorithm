package OOPsConcepts;

public class App {

    public static void main(String[] args) {
        // Creating an object of Student class using default constructor
        // Student A = new Student();
        // A.id = 1;
        // A.age = 20;
        // A.name = "John";
        // A.nos = 5;
        // A.display();

        // Creating an object of Student class using parameterized constructor
        Student B = new Student(2, 22, "Alice", 10);
        // System.out.println(B.age); // This line will cause a compilation error because 'age' is private
        // B.getAge(); // This is also not visible because 'getAge()' is private
        B.display();

        // Creating an object of Student class using copy constructor

        // Student C = new Student(B);
        // C.display();
    }
}
