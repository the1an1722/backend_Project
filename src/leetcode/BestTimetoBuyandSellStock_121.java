package leetcode;

public class BestTimetoBuyandSellStock_121 {

        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price; // Update lowest price
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice; // Update largest profit
                }
            }

            return maxProfit;
        }
}
