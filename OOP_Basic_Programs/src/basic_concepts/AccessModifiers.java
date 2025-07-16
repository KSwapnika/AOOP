package basic_concepts;

class Employee {
    public String name = "John";       // accessible anywhere
    private double salary = 50000;     // accessible only within class
    protected String department = "HR"; // accessible within package and subclass
    String location = "India";         // default (package-private)

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class AccessModifiers {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}


