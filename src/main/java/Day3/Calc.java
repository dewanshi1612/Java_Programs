package Day3;

public class Calc {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        char op = '/';
        switch (op)
        {
            case '+':
                System.out.println("Result is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result is : "+ (num1 - num2));
                break;
            case '*':
                System.out.println("Result is :" + (num1 * num2));
                break;
            case '/':
                System.out.println("Result is :" + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Operator !!");
        }
    }
}
