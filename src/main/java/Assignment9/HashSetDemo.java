package Assignment9;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        if (fruits.contains("Mango")) {
            System.out.println("Mango is present in the HashSet.");
        } else {
            System.out.println("Mango is not present in the HashSet.");
        }
    }
}
