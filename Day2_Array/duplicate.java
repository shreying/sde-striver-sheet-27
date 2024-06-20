class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point of the two runners.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle (duplicate number).
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test the findDuplicate method
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("The duplicate element is " + sol.findDuplicate(nums));
    }
}
