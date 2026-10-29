package Practice;

public class LargerNumof3 {

    public static void main(String[] args) {

        int a = 50, b = 30, c = 200;

        if((a>=b) && (a>=c))
        {
            System.out.println("Larger Number is a");
        }
        else if (b>=a &&  b>=c)
        {
            System.out.println("Larger Number is b ");
        }
        else
        {
            System.out.println("Larger Number is c");
        }
    }
}
