class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test the maxProfit method
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxPro = sol.maxProfit(prices);
        System.out.println("Max profit is: " + maxPro);
    }
}
