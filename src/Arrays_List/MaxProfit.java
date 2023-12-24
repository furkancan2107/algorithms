package Arrays_List;
/*
* Example 1:
-ilk gün satın alım yok
* al-sat max kar
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/
public class MaxProfit {
    public static void main(String[] args) {
        int[] list={7,1,5,3,6,4};
        System.out.println(maxProfit(list));
    }
    public static int maxProfit(int[] prices) {
         int max=0;
         if(prices.length>Math.pow(10,5)){
             return 0;
         }
         for(int i=0;i< prices.length;i++){
             for(int j=i+1;j<prices.length;j++){
                 int total=prices[j]-prices[i];
                if(total>max){
                    max=total;
                }
             }
         }
         return max;
    }
}
