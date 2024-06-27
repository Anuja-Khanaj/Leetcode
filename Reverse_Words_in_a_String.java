public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--; // Skip spaces

            if (i < 0) break; // If we reach the beginning of the string, break

            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--; // Find the beginning of the word

            if (ans.length() > 0) {
                ans.append(' '); // Add space before the next word
            }
            ans.append(s.substring(i + 1, j + 1)); // Add the word to the result
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Reverse_Words_in_a_String r = new Reverse_Words_in_a_String();
        System.out.println(r.reverseWords("  the sky is blue  "));
    }
}

// class Solution {
//     public String reverseWords(String s) {
//         char[] arr = s.toCharArray();
//         char[] res = new char[s.length() + 1];
//         int y = 0;
//         int i = s.length() - 1;
//         while (i >= 0) {
//             while (i >= 0 && arr[i] == ' ') i--;
//             int j = i;
//             if (i < 0) break;
//             while (j >= 0 && arr[j] != ' ') j--;
//             int k = j + 1;
//             while (k <= i) {
//                 res[y++] = arr[k++];
//             }
//             res[y++] = ' ';
//             i = j - 1;
//         }
//         return new String(res, 0, y > 0 ? y - 1 : 0);
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         System.out.println(sol.reverseWords("the sky is blue"));
//     }
// }
