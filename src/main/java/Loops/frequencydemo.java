package Loops;

import java.util.HashMap;

public class frequencydemo {
    public static void main(String[] args) {

        String str = "Alpa";

        HashMap<Character,Integer>map = new HashMap<>();

        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println(map);

    }

}
