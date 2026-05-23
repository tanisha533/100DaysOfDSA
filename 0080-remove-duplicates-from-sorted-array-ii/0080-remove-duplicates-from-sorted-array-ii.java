class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int fst=2, sc=2;
        while(sc<nums.length){
            if (nums[sc] != nums[fst - 2]){
                nums[fst]=nums[sc];
                fst++;
            }
                sc++;
            
        }
        return fst;
    }
}