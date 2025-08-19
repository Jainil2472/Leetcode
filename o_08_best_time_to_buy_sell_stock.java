public class o_08_best_time_to_buy_sell_stock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_price = Integer.MAX_VALUE;
        for(int i = 0 ; i< prices.length; i++){
            if(min_price > prices[i]){
                min_price = prices[i];
            }
            profit = Math.max(profit, prices[i] - min_price);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        o_08_best_time_to_buy_sell_stock profit = new o_08_best_time_to_buy_sell_stock();
        System.out.println(profit.maxProfit(prices)); 
    }
}