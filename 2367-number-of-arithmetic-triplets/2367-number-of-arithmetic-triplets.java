class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
    int count=0;
    HashSet<Integer> set=new HashSet<>();
    for(int i:nums){
        set.add(i);
    }
    for(int k=0; k<nums.length; k++){
        if(set.contains(nums[k]+diff) &&
         set.contains(nums[k]-diff)){
         count++;
         }
         else{
            continue;
         }

    }
    
    return count;
    }
}