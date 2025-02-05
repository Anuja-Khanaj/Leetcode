import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];  // Frequency array for a-z
            for (char c : word.toCharArray()) {
                count[c - 'a']++;  // Increment letter count
            }

            String key = Arrays.toString(count);  // Convert to string key
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(word);
        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
}
