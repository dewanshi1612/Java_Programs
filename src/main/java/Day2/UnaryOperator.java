package Day2;

public class UnaryOperator {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Plus Symbol:" + (+a));
        System.out.println("Minus Symbol:" + (-a));
        a++;
        System.out.println("After a++:" + a);
        ++a;
        System.out.println("After ++a:" + a);
        a--;
        System.out.println("After a--:" + a);
        --a;
        System.out.println("After --a:" +a);
    }
}
