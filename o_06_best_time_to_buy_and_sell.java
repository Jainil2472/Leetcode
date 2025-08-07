public class o_06_best_time_to_buy_and_sell {

    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0],min_len=0;
        System.out.println("hello");
        for (int i = 0; i < (prices.length - 1); i++) {
            if (prices[i] < min) {
                min = prices[i]; 
                min_len = i;
                System.out.println(i+" "+prices[i]);
            }
        }
        if(prices[min_len]>prices[(prices.length) - 1]){
            return 0;
        }else{

        for (int i = min_len; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i]; 
            }
        }
        }
        return max-prices[min_len];
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        o_06_best_time_to_buy_and_sell bs = new o_06_best_time_to_buy_and_sell();
        System.out.println(bs.maxProfit(prices));
        
    }
}
    

