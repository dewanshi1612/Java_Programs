package Assignment4;

public class CharacterType {

    public static void main(String[] args) {

        char ch = '@';

        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is a Special Character");
        }
    }

}
