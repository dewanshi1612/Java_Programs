package Practice;

public class LinearSearchWithFunction {

    public int linearSearch(int[]arr,int target)
    {

       // int index =-1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,40,60};
        int target = 40;

        LinearSearchWithFunction obj = new LinearSearchWithFunction();
        int index = obj.linearSearch(arr,target);

        if(index == -1)
        {
            System.out.println("Element not Found");
        }
        else
        {
            System.out.println("Elemrnt is found" +index);
        }
    }
}
