class Solution {
    public int subarraySum(int[] nums) {
        int ans=0;

       
        for(int i=0; i<nums.length; i++){
            int st=Math.max(0, i - nums[i]);
            while(st<=i){
                ans+= nums[st];
                st++;
            }

        }
        return ans;
    }
}