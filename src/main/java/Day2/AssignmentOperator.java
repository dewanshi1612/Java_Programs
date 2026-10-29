package Day2;

public class AssignmentOperator {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Num after Assigned:" + num);
        num+=5;
        System.out.println("Num after +=:" +num);
        num -= 3;
        System.out.println("Num after -=:" +num);
        num *= 2;
        System.out.println("Num after *=:" +num);
        num /= 4;
        System.out.println("Num after /=:" +num);
        num %= 5;
        System.out.println("Num after %=:" +num);
    }
}
