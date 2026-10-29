package Assignment7;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello Student");
            fw.write("\nWelcome to Java File Handling");
            fw.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
