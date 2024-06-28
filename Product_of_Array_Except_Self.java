public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        int mult = 1;
        for(int i = 0 ; i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                
                if(i == j){
                  continue;
                }else{
                    mult = mult*nums[j];
                }
            }
            ans[i] = mult;
            mult = 1;
        }

        return ans;        
    }

    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] ans = new int[n];

    //     // Step 1: Calculate prefix products
    //     ans[0] = 1; // No elements to the left of the first element
    //     for (int i = 1; i < n; i++) {
    //         ans[i] = ans[i - 1] * nums[i - 1];
    //     }

    //     // Step 2: Calculate suffix products and combine with prefix products
    //     int suffixProduct = 1;
    //     for (int i = n - 1; i >= 0; i--) {
    //         ans[i] = ans[i] * suffixProduct;
    //         suffixProduct *= nums[i];
    //     }

    //     return ans;
    // }
    
    public static void main(String[] args) {
        Product_of_Array_Except_Self p = new Product_of_Array_Except_Self();
        int [] nums = {-1,1,0,-3,3};
       int ans[] = p.productExceptSelf(nums);
       for(int i = 0 ; i<ans.length;i++){
       System.out.print(ans[i]);
    }
    }
}
