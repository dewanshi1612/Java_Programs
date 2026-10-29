package Assignment9;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Dewanshi");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "Amit");
        students.put(105, "Neha");

        System.out.println("Student Details:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +
                    ", Name: " + entry.getValue());
        }
    }
}
