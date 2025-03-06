public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Step 1: Assume the first string as the prefix
        String prefix = strs[0];

        // Step 2: Compare prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: ""

        String[] strs3 = {"interview", "internet", "internal"};
        System.out.println(longestCommonPrefix(strs3)); // Output: "inte"
    }
}
