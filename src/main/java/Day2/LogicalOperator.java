package Day2;

public class LogicalOperator {

    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;
        if((age > 18) && hasLicense)
        {
            System.out.println("You can Drive Car");
        }
        if((age >18) || hasLicense)
        {
            System.out.println("One Condition is true in OR Operator");
        }
        boolean isDrunk = true;
        if(!isDrunk)
        {
            System.out.println("You are allowed to drive car!");
        }
    }
}
