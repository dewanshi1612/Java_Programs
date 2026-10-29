package Practice;

public class InterwardRow {

    public static void main(String[] args) {

        int size = 4;

        for(int i=size;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
