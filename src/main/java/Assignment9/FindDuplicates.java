package Assignment9;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 10, 50, 30};

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Elements:");
        for (int num : duplicates) {
            System.out.println(num);
        }
    }
}
