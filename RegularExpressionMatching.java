public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern

        // Handle patterns with '*' at the start (like "a*" or ".*")
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2]; // '*' eliminates preceding element
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    // Direct character match or '.' wildcard
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    // '*' can either eliminate previous char or match multiple times
                    dp[i][j] = dp[i][j - 2] || 
                               (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));         // Output: false
        System.out.println(isMatch("aa", "a*"));        // Output: true
        System.out.println(isMatch("ab", ".*"));        // Output: true
        System.out.println(isMatch("aab", "c*a*b"));    // Output: true
        System.out.println(isMatch("mississippi", "mis*is*p*.")); // Output: false
    }
}
