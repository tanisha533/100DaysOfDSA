public class f {
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
          if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);    
          }
          else{
             buyprice=prices[i];
          }
        } 
        return maxprofit;
     }
     public static void main(String[] args) {
        int arr[]={1,5,6,7,8,4};
        System.out.println(maxProfit(arr));
}
}