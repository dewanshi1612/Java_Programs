package Assignment9;

import java.util.ArrayList;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(56);

        System.out.println("Before Sorting:");
        System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("After Sorting:");
        System.out.println(numbers);
    }
}
