public class Sorted_array {
    public static void main(String args[]){
        int arr[] = {10,1,30,40,50};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("The array is not sorted in ascending order.");
                return;
            }
            
        }
        System.out.println("The array is sorted in ascending order.");
    }
}
