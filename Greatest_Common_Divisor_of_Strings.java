public class Greatest_Common_Divisor_of_Strings {

    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenation of the strings in both possible orders is the same
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 from the start up to the GCD length
        return str1.substring(0, gcdLength);
    }

    // Helper function to calculate the GCD of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
         Greatest_Common_Divisor_of_Strings solution = new Greatest_Common_Divisor_of_Strings();
        
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));  // Output: "ABC"
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));  // Output: "AB"
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));    // Output: ""
    }
}
