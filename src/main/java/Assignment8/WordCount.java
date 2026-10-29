package Assignment8;

public class WordCount {
    public static void main(String[] args) {

        String str = "Java is a programming language";

        String[] words = str.split(" ");

        int count = words.length;

        System.out.println("String: " + str);
        System.out.println("Total Number of Words: " + count);
    }
}
