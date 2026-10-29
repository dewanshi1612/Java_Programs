package Practice;

public class MissingElementDemoArray {

    public static int missingElement(int[]arr)
    {

        int expectedElement = arr.length+1;
        int expectedSum = (expectedElement * (expectedElement + 1)) / 2;
        int actualSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
           actualSum = actualSum + arr[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[]arr = {1,2,3,4,6};

        int missElement = missingElement(arr);
        System.out.println(missElement);
    }
}
