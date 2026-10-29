package Assignment8;

public class LongestWord {
    public static void main(String[] args) {

        String str = "Java is a powerful programming language";

        String[] words = str.split(" ");

        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Sentence: " + str);
        System.out.println("Longest Word: " + longestWord);
    }
}
