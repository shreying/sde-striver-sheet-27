import java.util.*;

class Solution {
    public int uniquePaths(int m, int n) {
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }
        return (int) res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int totalCount = obj.uniquePaths(2, 3);
        System.out.println("The total number of Unique Paths are " + totalCount);
    }
}
