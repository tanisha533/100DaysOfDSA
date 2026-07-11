class Solution {
    public int rob(int[] nums) {
        //Space Optimisation
          int n=nums.length;
          if (n == 0) return 0;
          if (n == 1) return nums[0];
           int prev2=nums[0];

           int prev = Math.max(nums[0], nums[1]);
        
        for(int i=2; i<nums.length; i++){
        int rob = nums[i] + prev2 ;
        int skip = prev;
        

        int curr = Math.max(rob, skip);
        prev2=prev; prev=curr; 
        }
        return prev;
          }
}