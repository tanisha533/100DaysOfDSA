class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=1, count=0;
        while(i<nums.length && j<nums.length){
            if (i == j) {
              j++;
              continue; // Agle iteration par chalo
    }
            if(Math.abs(nums[i]-nums[j])==k && i!=j){
                count++; j++;
                int current_i_val = nums[i];
// Jab tak agla element pichle jaisa hai, i ko aage badhao
       while (i < nums.length && nums[i] == current_i_val) {
        i++;
}
            }
            else if(nums[j]-nums[i]>k){
                i++;
            }
            else{
                j++;
            }
        }
        return count++;
    }
}