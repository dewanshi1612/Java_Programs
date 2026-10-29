package Assignment4;

public class WeekNumber {
    public static void main(String[] args) {

        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("Monday = 1");
                break;
            case "Tuesday":
                System.out.println("Tuesday = 2");
                break;
            case "Wednesday":
                System.out.println("Wednesday = 3");
                break;
            case "Thursday":
                System.out.println("Thursday = 4");
                break;
            case "Friday":
                System.out.println("Friday = 5");
                break;
            case "Saturday":
                System.out.println("Saturday = 6");
                break;
            case "Sunday":
                System.out.println("Sunday = 7");
                break;
            default:
                System.out.println("Invalid day name. Please enter a valid day.");
        }
    }
}
