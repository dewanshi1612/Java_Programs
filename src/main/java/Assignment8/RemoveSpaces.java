package Assignment8;

public class RemoveSpaces {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        String result = str.replace(" ", "");

        System.out.println("Original String: " + str);
        System.out.println("String after removing spaces: " + result);
    }
}
