package Practice;

public class LinearSearchDemo {

    public int linearSearch(int[]arr,int target)
    {

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,40,20,60};
        int target = 50;

        LinearSearchDemo obj1 = new LinearSearchDemo();
        int index = obj1.linearSearch(arr,target);

        if(index == -1)
        {
            System.out.println("Element is not Found");
        }
        else
        {
            System.out.println("Element is Found" + index);
        }
    }
}
