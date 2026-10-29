package Day3;
// Using 3rd variable
public class Swap {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap a is : " + a);
        System.out.println("After Swap b is : " + b);
    }
}
