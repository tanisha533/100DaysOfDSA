class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        do{
            slow=nums[slow]; //+1 se increment
            fast=nums[nums[fast]]; //+2 se increment
        }
        while(slow!=fast);

        //reset slow to start
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow]; //+1 se increment
            fast=nums[fast]; //+1 se increment
        }
        return slow;
    }
}