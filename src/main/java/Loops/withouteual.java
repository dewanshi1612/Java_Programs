package Loops;

public class withouteual {

    public static void main(String[] args) {

        String str1 = "Selenium";
        String str2 = "Selenium";

        boolean isEqual = true;


        if(str1.length() != str1.length())
        {
            isEqual = false;
        }
        else
        {
            for(int i =0; i< str1.length();i++)
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
            System.out.println("String is Equal");
        }


    }
}
