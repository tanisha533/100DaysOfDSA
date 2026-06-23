class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        long leftSum=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long rightSum=totalSum-leftSum;
            
            if(nums[i]==0 && leftSum==rightSum){
                count+=2;}
            
            if(nums[i]==0 && rightSum-1==leftSum){
                count+=1;}
            
            if(nums[i]==0 && rightSum==leftSum-1){
                count+=1;}
            }

            return count;
    }
}