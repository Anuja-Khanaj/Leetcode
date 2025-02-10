public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // Calculate the area
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
     }

    //  static {
    //     for (int i=0;i<500;i++) {
    //         maxArea(new int[]{0, 0});
    //     }
    // }
    // public static  int maxArea(int[] height) {
    //     int l=0,r=height.length-1,max_area=0;
    //     while (l<r){
    //         int h=Math.min(height[l],height[r]);
    //         max_area=Math.max(max_area,h*(r-l));
    //         while(l<r && height[l]<=h)
    //         {
    //             l++;
    //         }
    //          while(l<r && height[r]<=h)
    //         {
    //             r--;
    //         }
    //     }
    //     return max_area;
    // }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // Output: 49
    }
}
