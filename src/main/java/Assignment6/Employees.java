package Assignment6;

public final class Employees {

    private final int id;

    public Employees(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

        Employees emp = new Employees(101);

        System.out.println("Employee ID: " + emp.getId());
    }
}
