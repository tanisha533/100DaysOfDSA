class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0; int count=0; int max=0;
        int right=0;
            while(right<nums.length){
                if(nums[right]==0){
                 left=right+1;
                 right++;
                }
                else{
                    right++;
                }
                count=right-left;
                max=Math.max(max,count);
            }
            return max;
    }
}