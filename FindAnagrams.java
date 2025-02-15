import java.util.*;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] p_count = new int[26];  // Frequency array for p
        int[] s_count = new int[26];  // Frequency array for s

        for (char c : p.toCharArray()) p_count[c - 'a']++;  // Count p characters
        for (int i = 0; i < p.length(); i++) s_count[s.charAt(i) - 'a']++;  // First window

        if (Arrays.equals(s_count, p_count)) result.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            s_count[s.charAt(i) - 'a']++;  // Add new character
            s_count[s.charAt(i - p.length()) - 'a']--;  // Remove old character

            if (Arrays.equals(s_count, p_count)) 
                result.add(i - p.length() + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));  // Output: [0, 6]
    }
}
