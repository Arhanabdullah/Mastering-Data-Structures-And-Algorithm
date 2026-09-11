package OOPsConcepts;


public class Student {
    //Attributes
    public int id;
    private int age;
    public String name;
    public int nos;
    //Default Constructor
    public Student() {
        System.out.println("Default Constructor");
    }
    //Parameterized Constructor
    public Student(int id, int age, String name, int nos) {
        //Initializing attributes using 'this' keyword
        // 'this' keyword is used to refer to the current object
        // It is used to differentiate between instance variables and local variables
        // In this case, the instance variables are 'id', 'age', 'name', and 'nos'
        
        // System.out.println("Parameterized Constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Copy Constructor
    public Student(Student s) {
        System.out.println("Copy Constructor");
        this.id = s.id;
        this.age = s.age;
        this.name = s.name;
        this.nos = s.nos;
    }
    //Methods
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Nos: " + nos);
    }
    private void getAge() {
        System.out.println("Age: " + age);
    }

}
