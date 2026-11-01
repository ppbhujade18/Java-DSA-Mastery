import java.util.*;

public class stocks{
    public static int buysellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0; i<prices.length;i++){
            if (buyprice<prices[i]) {
                int profit = prices[i] - buyprice;
                max_profit = Math.max(max_profit, profit);
                
            }
            else{
                buyprice = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int prices[] = {4,8,5,1,7,2};
        System.out.println(buysellStocks(prices));

    }
}