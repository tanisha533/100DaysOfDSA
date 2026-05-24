class Solution {
    public void rotate(int[] nums, int k) {
        int left=0, right=nums.length-1;
        int arr[]= new int[nums.length];
       
            for(int i=0; i<nums.length; i++){
                int newPosition = (i + k) % nums.length;
                arr[newPosition] = nums[i];           
            
        }
        for(int j=0; j<nums.length; j++){
            nums[j]=arr[j];
        }
        
    }
}