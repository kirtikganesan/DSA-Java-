public class buyandsellstocks {
    public static void buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        System.out.println("The max profit of buying and selling the stocks from the given data is: "+maxProfit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        buyAndSellStocks(prices);
    }
}
