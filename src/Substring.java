import java.util.HashMap;

public class Substring {
    public static void lenSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashMap<Character, Integer> charMap = new HashMap<>();

        while (j < s.length()) {
            if (!charMap.containsKey(s.charAt(j))) {
                charMap.put(s.charAt(j), j);
                j++;
                max = Math.max(charMap.size(), max);
            } else {
                charMap.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println("Length of the longest substring without repeating characters: " + max);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        lenSubstring(input);
    }
}
 