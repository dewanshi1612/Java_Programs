package Practice;

public class Array2D {

    public static void main(String[] args) {

        int[][] arr = {{10,20,30}, {50,60,80}};

      /*  System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);*/

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }






}
