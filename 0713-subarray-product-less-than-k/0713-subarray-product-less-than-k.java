class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int count=0;
       int left=0; int product=1;
       int n=nums.length;
       if(k==0) return 0;
       for(int right=0; right<n; right++){
          
          product*=nums[right];
          
            while (left <= right && product >= k){
                product=product/nums[left];
                left++;
            }
          count += (right - left + 1);
          
       }
       return count;
       
    }
}