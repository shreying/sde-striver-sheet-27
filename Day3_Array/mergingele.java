class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        Integer candidate = null;

        // Step 1: Find a candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1; // This case won't happen for valid inputs as per problem statement
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = solution.majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
