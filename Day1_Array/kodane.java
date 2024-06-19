class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test the maxSubArray method
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = sol.maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
