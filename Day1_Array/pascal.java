import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= numRows; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }

    private static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test the Pascal's Triangle generation
        int numRows = 5;
        List<List<Integer>> ans = sol.generate(numRows);
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : ans) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
