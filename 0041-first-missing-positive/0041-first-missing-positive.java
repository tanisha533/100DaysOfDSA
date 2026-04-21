class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean[] ans=new boolean[n+1];
        for(int i=0; i<n; i++){
           if(nums[i]>0 && nums[i]<=n){
             ans[nums[i]]=true;
           }
        }
        for (int i = 1; i <= n; i++) {
            if (!ans[i]) {
                return i;
            }
        }
       return n+1;
    }
}