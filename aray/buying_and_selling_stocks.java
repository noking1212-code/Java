import java.util.*;

public class buying_and_selling_stocks {
    public static void main(String args[]){
        int prices[]= {7,1,5,3,6,4};
        int bp = prices[0];
        int profit =0;
        for(int i=0;i<prices.length;i++ ){
            bp = Math.min(prices[i], bp);
            int sp = prices[i];
            profit= Math.max(sp-bp,profit);
        }
        System.out.print(profit);
    }
}