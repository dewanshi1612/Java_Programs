package Practice;

public class SecondMaxMinArray {

    public static void main(String[] args) {

        int[]arr = {5,3,9,7,1,8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != 0)
            {
                secondMax = arr[i];
            }

            if(arr[i]<min)
            {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i]<secondMin && arr[i] != 0)
            {
                secondMin = arr[i];
            }
        }

        System.out.println("Second Maximum Number is: " + secondMax);
        System.out.println("Second Minimum Number is: " + secondMin);
    }
}
