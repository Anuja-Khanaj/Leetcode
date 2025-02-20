import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String currentString = "";
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');  // Build multi-digit number
            } else if (c == '[') {
                numStack.push(currentNum);  // Save repeat count
                strStack.push(currentString);  // Save previous string
                currentString = "";
                currentNum = 0;
            } else if (c == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());  // Get previous string
                temp.append(currentString.repeat(repeatTimes));  // Repeat and append
                currentString = temp.toString();
            } else {
                currentString += c;
            }
        }

        return currentString;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));  // Output: "aaabcbc"
        System.out.println(decodeString("3[a2[c]]"));  // Output: "accaccacc"
        System.out.println(decodeString("2[abc]3[cd]ef"));  // Output: "abcabccdcdcdef"
    }
}
