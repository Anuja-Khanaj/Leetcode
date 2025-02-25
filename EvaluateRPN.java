import java.util.Stack;

public class EvaluateRPN {
    public static int evalRPN(String[] tokens){
        

        Stack <Integer> s = new Stack<>();
        for (String index:tokens) {
            if("+".equals(index) || "-".equals(index) || "/".equals(index) || "*".equals(index)  ){
                int a = s.pop();
                int b = s.pop();

                switch (index) {
                    case "+": s.push(a + b); break;
                    case "-": s.push(a - b); break;
                    case "*": s.push(a * b); break;
                    case "/": s.push(a / b); break; 
                }
            }
            else{
                s.push(Integer.parseInt(index));
            }
        }
        return s.pop() ;
    }
    
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));  // Output: 9
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));  // Output: 6
    }
    //  kuch bhi ho jaye ye sab me nahi hone dunga 
    //  naam he mera jggaa dakuuuu 
    //  ha ha haaaaaaaaaa 
    // ku ni ho rha mujseee
    // kya haal he bhai tera bohot hi mast lag raha hai tiii chiknee beteeee.
    // codung that needs to be don can be doneee
    // hei babeeee
    // 
}
