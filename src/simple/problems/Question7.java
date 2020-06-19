package simple.problems;

import java.util.HashMap;
import java.util.Map;

public class Question7 {
    public boolean isIsomorphic(String s, String t) {
        Map<String, String> checkTwo = new HashMap<>();
        Map<String, String> checkOne = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            String one = String.valueOf(s.charAt(i));
            String two = String.valueOf(t.charAt(i));

            if (checkOne.containsKey(two)) {
                if (!checkOne.get(String.valueOf(t.charAt(i))).equals(one))
                    return false;
            }
            if(checkTwo.containsKey(one)) {
                if (!checkTwo.get(String.valueOf(s.charAt(i))).equals(two))
                    return false;
            }
            checkOne.put(two, one);
            checkTwo.put(one, two);
        }
        return true;
    }
}
