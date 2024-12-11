class r {
    r() {
    }

    int taiger() {
        int[] nums = new int[]{1, 7, 3, 4, 5, 6};
        if (nums.length < 2) {
            return nums[0];
        } else {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);

            for(int i = 2; i < nums.length; ++i) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }

            return dp[nums.length - 1];
        }
    }
}


public class Houserobber {
    // Creating an object of class A
    public static void main(String[] args) {


        r rt = new r();

        // Calling the taiger method to get the maximum loot
        int maxLoot = rt.taiger();

        // Printing the result
        System.out.println("Maximum loot: " + maxLoot);
    }
}
