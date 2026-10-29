package Day3;

public class LargerOfThree {

    public static void main(String[] args) {

        int a = 20, b = 50, c = 15;

        if(a>=b && a>=c)
        {
            System.out.println("Larger Number is A");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("Larger Number is B");
        }
        else
        {
            System.out.println("Larger Number is C");
        }
    }
}
