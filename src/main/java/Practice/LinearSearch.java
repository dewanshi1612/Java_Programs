package Practice;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        int target = -90;

        int index = -1;

        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        {
            System.out.println("Element not Found");
        }
        else
        {
            System.out.println("Element is found" + index);
        }
    }
}
