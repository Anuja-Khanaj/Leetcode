public class Find_missing_number_XORTrick {
    // declare 2 arrays, one for the given numbers and another for the complete range of numbers. Then, use the XOR operation to find the missing number.

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int n = arr.length +1;
        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < n - 1; i++) {
            x1 = x1 ^ arr[i];
        }
        // why we use i = 0: to iterate through the given array and compute XOR of all elements
        // why we use i=1: to iterate through the complete range of numbers from 1 to n and compute XOR of all those numbers. This helps in finding the missing number by comparing the two XOR results.

        for (int i = 1; i <= n; i++) {
            x2 = x2 ^ i;
        }

        System.out.println("Missing number is: " + (x1 ^ x2));
    }
}


/*It runs in linear time (O(n)).
It uses constant extra space (O(1)).
It avoids potential integer overflow that can occur with the sum formula for very large values of n.
It demonstrates a solid understanding of bitwise operations, which is a common interview topic. */