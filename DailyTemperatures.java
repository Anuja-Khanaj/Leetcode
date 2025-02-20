import java.util.Stack;
public class DailyTemperatures {
    public static int[] dailyTemperatures(int arr[]){
        int[] temperature = new int[arr.length];
        Stack <Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]> arr[s.peek()]) {
                int prevIndex = s.pop();
                temperature[prevIndex] = i-prevIndex;
            }
            s.push(i);
        }

        return temperature;
    }

  public static void main(String[] args) {
    int[] temperatures = {73,74,75,71,69,72,76,73};
    int[] result = dailyTemperatures(temperatures);
    System.out.println("\n");
    for (int num : result) {
        System.out.print(num + " ");
    }
  }  
}
