public class Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i-1]< nums[i] && nums[i+1]>nums[i]){
                return true;
                
            }

        }


        return false;

    }


    public static void main(String[] args) {
        
    }
}
