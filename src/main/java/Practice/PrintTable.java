package Practice;

import java.util.Scanner;

public class PrintTable {

    public void printTable(int num)
    {
        for(int i =1; i<=10; i++)
        {
            System.out.println(num + "*" + i + "=" + (num*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num  = sc.nextInt();

        PrintTable obj = new PrintTable();
        obj.printTable(num);

    }
}
