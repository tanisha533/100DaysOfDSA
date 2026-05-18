class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length; i++){
           int j=i+1, k=nums.length-1;

           while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
           if (Math.abs(sum - target) < Math.abs(closest_sum - target)) {
    // THEN save this actual sum as our new best choice
    closest_sum = sum;
}
            if(sum<target){
                j++;
            }
            else if(sum>target){
                k--;
            }
            else{
                return target;
            }
              
           }
    
        }
          return closest_sum;
            
    }
}