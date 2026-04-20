class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
       List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int idx= Math.abs(nums[i]) - 1;

           if(nums[idx]<0){ //already visited
        list.add(Math.abs(nums[i])); //duplicate mila
        }
        else{
              nums[idx]=-nums[idx];
        }
        }
        return list;
    }
}