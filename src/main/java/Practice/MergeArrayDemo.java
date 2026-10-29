package Practice;

import java.util.Arrays;

public class MergeArrayDemo {

    public static void main(String[] args) {

        int[] a = {10,20,5};
        int[] b = {1,7,70,84,36,78};

        int[] c = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }
        for(int j = 0; j < b.length; j++)
        {
            c[a.length+j] = b[j];
        }

        Arrays.sort(c);

        for(int element:c)
        {
            System.out.print(element + " ");
        }
    }
}
