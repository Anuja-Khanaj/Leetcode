public class Largest_smallest_element{
    public static void main(String args[]){
        int arr[] = {10,20,70,80,10,35};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length ; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
        if(arr[i]<smallest){
            smallest = arr[i];
        }
    }
    System.out.println("Largest element: " + largest);
    System.out.println("Smallest element: " + smallest);
}}