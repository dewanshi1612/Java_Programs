package Practice;

public class ArrayForeach2DDemo {

    public static void main(String[] args) {

        String[][] studentName = {{"Dewanshi","Shah"},{"Bhumi","shah","Sheth"}};

        for(String[] row:studentName)
        {
            for(String name:row)
            {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
