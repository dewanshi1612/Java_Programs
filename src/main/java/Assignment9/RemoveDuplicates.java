package Assignment9;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);

        System.out.println("Original ArrayList:");
        System.out.println(list);

        HashSet<Integer> uniqueSet = new HashSet<>(list);

        System.out.println("Unique Elements:");
        for (Integer num : uniqueSet) {
            System.out.println(num);
        }
    }

}
