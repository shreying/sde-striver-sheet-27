class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test the sortColors method
        int[] nums = {0, 2, 1, 2, 0, 1};
        sol.sortColors(nums);
        
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
