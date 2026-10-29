package Day3;
//without 3rd variable
public class Swap2 {

    public static void main(String[] args) {

        int a = 20, b = 30;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swap a is :" +a);
        System.out.println("After Swap b is :" +b);
    }
}
