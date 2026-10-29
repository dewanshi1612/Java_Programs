package Practice;

public class SwapWithout {

    public static void main(String[] args) {

        int a = 10, b = 20;

        a = a+b;
        b = a-b;
        a = a- b;
        System.out.println( "after swaping A" + a);
        System.out.println("after swaping B" + b);
    }
}


/*a = 10 + 20 = 30
b = 30-20 = 10
a = a-b  30 - 10 = 20*/