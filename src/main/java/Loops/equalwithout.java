package Loops;

public class equalwithout {

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "java";

        boolean isEqual = true;

        if(str1.length() != str2.length())
        {
            isEqual = false;
        }
        else
        {
            for(int i = 0; i> str1.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(i))
                {
                    isEqual = false;
                    break;
                }
            }
        }
        if(isEqual == true)
        {
            System.out.println("String Equal");
        }
    }
}
