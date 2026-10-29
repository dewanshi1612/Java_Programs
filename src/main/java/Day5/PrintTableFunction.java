package Day5;

import java.util.Scanner;

public class PrintTableFunction {

    //With Function
    void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:");
    int num = sc.nextInt();

    PrintTableFunction obj = new PrintTableFunction();
    obj.printTable(num);

}
}
