package Practice;

public class MaxMinWithoutFunction {

    public static void main(String[] args) {

        int[]arr = {4,7,2,9,1,5};

        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("Maximum Number in Array is: " + max);
        System.out.println("Minimum Number in Array is: " + min) ;
    }
}
