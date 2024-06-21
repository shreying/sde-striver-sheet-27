class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        long nn = n;
        if (nn < 0) {
            nn = -nn;
            x = 1 / x;
        }
        double ans = 1.0;
        while (nn > 0) {
            if ((nn % 2) == 1) {
                ans *= x;
            }
            x *= x;
            nn /= 2;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2, 10));  // Output: 1024.0
        System.out.println(solution.myPow(2.1, 3));  // Output: 9.261
        System.out.println(solution.myPow(2, -2));   // Output: 0.25
    }
}
