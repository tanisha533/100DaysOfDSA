class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total_sum =0;
        int n=nums.length; 
        int ans[]=new int[nums.length];
        for(int i=0; i<n; i++){
            total_sum += nums[i];
        }
        int right_sum = total_sum, left_sum = 0; 
        for(int i=0; i<n; i++){
            right_sum -= nums[i]; 
            ans[i] = Math.abs(right_sum - left_sum); 
            left_sum += nums[i]; 
        }

        return ans;
    }
}