package Assignment6;

public class Persondemo {

    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be a positive value.");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Persondemo p = new Persondemo();

        p.setAge(25);
        System.out.println("Age: " + p.getAge());

        p.setAge(-10);
    }
}
