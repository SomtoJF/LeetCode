class Q121 {
    public static void main(String[] args) {
        int[] prices = { 1, 7, 3, 8, 2, 6 };
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int maxRange = 0;
        int cheapestPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < cheapestPrice) {
                cheapestPrice = prices[i];
            } else if (maxRange < prices[i] - cheapestPrice) {
                maxRange = prices[i] - cheapestPrice;
            }
        }
        return maxRange;
    }
}
