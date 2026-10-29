package Assignment6;

public class Students {

    int id;

    Students(int id) {
        this.id = id;
    }

    Students(Students s) {
        this.id = s.id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {

        Students s1 = new Students(101);

        Students s2 = new Students(s1);

        System.out.println("First Object:");
        s1.display();

        System.out.println("Second Object:");
        s2.display();
    }
}
