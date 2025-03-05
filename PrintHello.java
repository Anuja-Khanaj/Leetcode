public class PrintHello {
   // Static inner class
   static class Sum {
      int c; // Store the sum
      Sum(int a , int b) {
         this.c = a + b;
      }

      // Override toString() to print the sum
      @Override
      public String toString() {
         return "Sum: " + c;
      }
   }

   public static void main(String[] args) {
      Sum s = new Sum(1, 2);
      System.out.println(s); // Will print "Sum: 3"
   }
}

