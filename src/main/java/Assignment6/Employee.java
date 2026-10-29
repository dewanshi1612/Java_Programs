package Assignment6;

public class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Dewanshi");
        emp.display();
    }

}
