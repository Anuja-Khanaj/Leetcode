import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraysum(int[] nums, int k){
        HashMap<Integer,Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        int count = 0;
        int prefixSum = 0;

        
        for (int num : nums) {
            prefixSum += num;  // Compute prefix sum
            
            // Check if (prefix_sum - k) exists in hashmap
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }
            
            // Update hashmap with current prefix_sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count; 
    }
    public static void main(String[] args) {
        int[] nums = {1,-1, 1,1,1,1};
        int k = 3;
        System.out.println("\n"+subarraysum(nums, k));
    }
}
