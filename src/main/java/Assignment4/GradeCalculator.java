package Assignment4;

public class GradeCalculator {

    public static void main(String[] args) {

        int marks = 82;

        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                System.out.println("Grade: A — Excellent");
            } else if (marks >= 75) {
                System.out.println("Grade: B — Very Good");
            } else if (marks >= 60) {
                System.out.println("Grade: C — Good");
            } else if (marks >= 35) {
                System.out.println("Grade: D — Pass");
            } else {
                System.out.println("Grade: F — Fail");
            }
        } else {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
        }
    }
}
