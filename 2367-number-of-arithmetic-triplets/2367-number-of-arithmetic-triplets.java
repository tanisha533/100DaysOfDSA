class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int j=1, k=2;
        int n=nums.length-1; 
        for(int i=0; i<nums.length; i++){
            
         while(nums[j] < nums[i] + diff && j<n-1){
                j++;
            }
        while(nums[k] < nums[j] + diff && k<n){
                k++;
            }

        if(nums[j] - nums[i] == diff && 
            nums[k]-nums[j]==diff) {
                count++;
            }
        }
        return count++;
    }
}