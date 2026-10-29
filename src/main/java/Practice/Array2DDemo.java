package Practice;

public class Array2DDemo {

    public static void main(String[] args) {

        int[][] numbers = { {20,40,60}, {30,60,90}};

        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = 0; j<numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
