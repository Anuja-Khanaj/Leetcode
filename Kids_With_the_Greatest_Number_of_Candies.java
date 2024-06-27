import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        System.out.println(max);

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
           
            if (  candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    // Another approach
    // public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    //     List<Boolean> ans = new ArrayList<>(candies.length);
    //     int temp = 0;
    //     for(int i= 0; i<candies.length; i++)
    //     {
    //         if(candies[i] > temp)
    //         {
    //             temp = candies[i];
    //         }
    //     }
    //     for(int i=0; i<candies.length; i++)
    //     {
    //        ans.add(temp<=candies[i] + extraCandies);
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {

        Kids_With_the_Greatest_Number_of_Candies solution = new Kids_With_the_Greatest_Number_of_Candies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
