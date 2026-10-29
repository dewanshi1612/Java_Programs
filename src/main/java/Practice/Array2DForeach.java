package Practice;

public class Array2DForeach {

    public static void main(String[] args) {

        int[][] interviewMarks = {{20,50,30,60}, {10,60,-34}};

        for(int[] row:interviewMarks)
        {
            for(int Marks:row)
            {
                System.out.print(Marks + " ");
            }
            System.out.println();
        }
    }
}
