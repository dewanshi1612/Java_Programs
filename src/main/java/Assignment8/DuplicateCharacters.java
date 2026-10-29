package Assignment8;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        System.out.println("Duplicate characters are:");

        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicatePrinted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    isDuplicatePrinted = true;
                    break;
                }
            }

            if (isDuplicatePrinted) {
                continue;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
