import java.util.Scanner;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String mergedString = mergeAlternately(word1, word2);
        System.out.println(mergedString); // Output: "apbqrs"
        sc.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLen = Math.max(len1, len2);

        for (int i = 0; i < maxLen; i++) {
            if (i < len1) {
                sb.append(word1.charAt(i));
            }
           
            if (i < len2) {
                sb.append(word2.charAt(i));
            }
           
        }

        return sb.toString();
    }
}
