import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        // Map<Integer, Integer> freqMap = new HashMap<>();
        // for (int num : nums) {
        //     freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        // }
        
        // // Step 2: Use a Min Heap (PriorityQueue)
        // PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
        //     new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());  // Min Heap by frequency
        
        // for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        //     minHeap.offer(entry);
        //     if (minHeap.size() > k) {
        //         minHeap.poll(); // Remove least frequent
        //     }
        // }
        
        // // Step 3: Extract the top K elements
        // int[] result = new int[k];
        // int index = 0;
        // while (!minHeap.isEmpty()) {
        //     result[index++] = minHeap.poll().getKey();
        // }
        // return result;

        int result[] = new int[nums.length];

        for(int i = 0 ; i < nums.length ;i++){

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 2))); // Output: [1,2]
        System.out.println(Arrays.toString(topKFrequent(new int[]{4,4,4,5,5,6,6,6,6}, 2))); // Output: [6,4]
    }
}