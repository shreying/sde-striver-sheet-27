import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // Find the longest consecutive sequence
        for (int num : set) {
            // If 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak found
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }

    public static void longconsec(String[] args) {
        Solution solution = new Solution();
        int[] nums = {100, 200, 1, 2, 3, 4};
        int result = solution.longestConsecutive(nums);
        System.out.println("The longest consecutive sequence is " + result);
    }
}
