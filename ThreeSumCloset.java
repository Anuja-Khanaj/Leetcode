import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with first three numbers

        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            // Step 3: Use two-pointer approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Step 4: Check if this sum is closer to the target
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                // Step 5: Adjust left and right pointers
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(nums1, 1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        System.out.println(threeSumClosest(nums2, 1)); // Output: 0
    }
}
