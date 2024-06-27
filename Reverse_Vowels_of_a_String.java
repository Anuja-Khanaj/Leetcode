import java.util.*;

public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        
       // Define a set of vowels for easy lookup
       Set<Character> vowelsSet = new HashSet<>();
       vowelsSet.add('a'); vowelsSet.add('e'); vowelsSet.add('i'); vowelsSet.add('o'); vowelsSet.add('u');
       vowelsSet.add('A'); vowelsSet.add('E'); vowelsSet.add('I'); vowelsSet.add('O'); vowelsSet.add('U');
       
       // Stack to store vowels
       Stack<Character> vowels = new Stack<>();

       // First pass: push vowels onto the stack
       for (int i = 0; i < s.length(); i++) {
           if (vowelsSet.contains(s.charAt(i))) {
               vowels.push(s.charAt(i));
           }
       }

       // Second pass: build the result string, replacing vowels with those from the stack
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < s.length(); i++) {
           if (vowelsSet.contains(s.charAt(i))) {
               sb.append(vowels.pop());
           } else {
               sb.append(s.charAt(i));
           }
       }

       return sb.toString(); 

    //    another approch
    // public String reverseVowels(String s) {
    //     boolean[] vowels = new boolean[128];
    //     for (char c: "aeiouAEIOU".toCharArray()){
    //         vowels[c] = true;
    //     }
    //     char[] cs =s.toCharArray();
    //     int i =0,j=cs.length-1;
    //     while(i<j){
    //         while(i<j && !vowels[cs[i]]){
    //             ++i;
    //         }
    //         while(i<j && !vowels[cs[j]]){
    //             --j;
    //         }
    //         if(i<j){
    //             char t =cs[i];
    //             cs[i]=cs[j];
    //             cs[j]=t;
    //             ++i;
    //             --j;
    //         }
    //     }
    //      return String.valueOf(cs);
    // }

    }
    public static void main(String[] args) {
        Reverse_Vowels_of_a_String solution = new Reverse_Vowels_of_a_String();
        String result = solution.reverseVowels("aA");
        System.out.println(result);  // Output: holle
    }
}
