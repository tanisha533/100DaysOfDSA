public class s {
    public static int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0; i<nums.length; i++){
             if(nums.length==1) return nums[i];
         currsum= Math.max(nums[i], currsum + nums[i]);
          if(maxsum<currsum){
            maxsum=currsum;
          }
        } 
        return maxsum;
    }
   public static void main(String[] args) {
    int arr[]={1,5,4,2,-11,-9,22};
    System.out.println(maxSubArray(arr));
   }
}
