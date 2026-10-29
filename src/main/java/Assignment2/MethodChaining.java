package Assignment2;

public class MethodChaining {

    private String name;
    private int age;
    private String city;

    MethodChaining setName(String name) {
        this.name = name;
        return this;
    }
    MethodChaining setAge(int age) {
        this.age = age;
        return this;
    }
    MethodChaining setCity(String city) {
        this.city = city;
        return this;
    }
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
    }
    public static void main(String[] args) {

        MethodChaining obj = new MethodChaining();

        obj.setName("Dewanshi Shah")
                .setAge(25)
                .setCity("Ahmedabad")
                .display();
    }
}
