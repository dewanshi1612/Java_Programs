package Assignment8;

public class VowelsAndConsonants {
    public static void main(String[] args) {

        String str = "Hello World";

        int vowels = 0;
        int consonants = 0;

        char[] chars = str.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("String: " + str);
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
}
