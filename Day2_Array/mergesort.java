class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Two pointers from the end of each array
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge the two arrays starting from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2, if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test the merge method
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        
        sol.merge(nums1, m, nums2, n);
        
        System.out.println("The merged array is:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
