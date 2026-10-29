package Practice;

public class MissingElementArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6};

        int expectedElement = arr.length+1;

        int expectedSum = (expectedElement*(expectedElement+1))/2;

        int actualSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            actualSum = actualSum + arr[i];
        }

        System.out.println("Missing Element: " + (expectedSum - actualSum));
    }
}
