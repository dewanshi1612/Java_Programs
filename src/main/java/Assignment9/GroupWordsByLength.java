package Assignment9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupWordsByLength {
    public static void main(String[] args) {

        String[] words = {"Java", "Python", "C", "HTML", "CSS", "Servlet", "JSP"};

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<String>());
            }

            map.get(length).add(word);
        }

        System.out.println("Words Grouped by Length:");

        for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
            System.out.println("Length " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
