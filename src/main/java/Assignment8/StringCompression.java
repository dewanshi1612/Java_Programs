package Assignment8;

public class StringCompression {
    public static void main(String[] args) {

        String str = "aabbbccddaaa";

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed = compressed + str.charAt(i) + count;
                count = 1;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressed);
    }
}
