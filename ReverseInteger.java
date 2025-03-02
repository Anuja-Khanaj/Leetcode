public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        int num1 = 123;
        System.out.println("Reversed: " + reverse(num1)); // Output: 321

        int num2 = -123;
        System.out.println("Reversed: " + reverse(num2)); // Output: -321

        int num3 = 1534236469; // Causes overflow
        System.out.println("Reversed: " + reverse(num3)); // Output: 0
    }
}
