package Assignment1;

public class SimpleInterest {

    public static void main(String[] args) {

        double principal = 10000.0;
        double rate = 5.0;
        double time = 3.0;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal Amount : " + principal);
        System.out.println("Rate of Interest : " + rate + "%");
        System.out.println("Time Period : " + time + " years");
        System.out.println("Simple Interest : " + simpleInterest);
    }

}
