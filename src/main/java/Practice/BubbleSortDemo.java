package Practice;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] abc = {50,30,40,10,20};

        int n = abc.length;

        System.out.println("Before Sorting:");
        for(int data:abc)
        {
            System.out.println(data + " ");
        }

        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-1-i; j++)
            {
                if(abc[j] > abc[j+1])
                {
                    int temp = abc[j];
                    abc[j] = abc[j+1];
                    abc[j+1] = temp;
                }
            }
            System.out.print("After Sorting:");
            for(int data:abc)
            {
                System.out.println(data + " ");
            }
        }
    }
}
