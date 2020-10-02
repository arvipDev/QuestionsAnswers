package simple.problems;

import java.util.HashMap;
import java.util.Map;

public class Question7 {
    public boolean isIsomorphic(String s, String t) {
        Map<String, String> check = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            String one = String.valueOf(s.charAt(i));
            String two = String.valueOf(t.charAt(i));

            if(check.containsKey(one)) {
                if (!check.get(String.valueOf(s.charAt(i))).equals(two))
                    return false;
            }
            else if (check.containsValue(two))
                return false;
            check.put(one, two);
        }
        return true;
    }
}
