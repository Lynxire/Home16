package task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static final Map<Character, Character> bracketPairs = new HashMap<>();

    static {
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
    }
    public static boolean isBalanced(String s) {
        int count = 0;

        for (char bracket : s.toCharArray()) {
            if (bracketPairs.containsKey(bracket)) {
                count++;
            } else if (bracketPairs.containsValue(bracket)) {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }

}
