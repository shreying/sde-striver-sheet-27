import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort the intervals by the starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Otherwise, there is overlap, so we merge the current and previous intervals.
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test the merge method
        int[][] intervals = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] mergedIntervals = sol.merge(intervals);
        
        System.out.println("The merged intervals are:");
        for (int[] interval : mergedIntervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println();
    }
}
