import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // HashMap to store the cumulative sum and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        
        // Initialize the map with sum 0 at index -1 to handle the case when subarray starts from index 0
        map.put(0, -1);

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Increment sum by 1 for 1 and decrement by 1 for 0
            sum += nums[i] == 1 ? 1 : -1;
            
            // If the sum has been seen before, it means there's a subarray with equal number of 0s and 1s
            if (map.containsKey(sum)) {
                // Calculate the length of the subarray
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // If the sum is seen for the first time, put it in the map with the current index
                map.put(sum, i);
            }
        }
        
        return maxLength;
    }

    public static void contiguous(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0};
        int result = solution.findMaxLength(nums);
        System.out.println("The maximum length of subarray with equal number of 0s and 1s is: " + result);
    }
}
