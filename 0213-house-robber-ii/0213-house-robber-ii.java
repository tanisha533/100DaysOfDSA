class Solution {
    public int rob(int[] nums) {
       if(nums.length==1) return nums[0];
       return Math.max(func(nums,0,nums.length-1),func(nums,1,nums.length)); 
    }
    //space optimise with subsequence
    public int func(int nums[],int start,int n){
        int prev=nums[start];
        int prev2=0;
        for(int i=start+1;i<n;i++){
           int take = nums[i] + prev2;
            int nottake = 0 + prev;
            int cur = Math.max(take,nottake);
            prev2 = prev;
            prev = cur;
        }
        return prev;
        }
}