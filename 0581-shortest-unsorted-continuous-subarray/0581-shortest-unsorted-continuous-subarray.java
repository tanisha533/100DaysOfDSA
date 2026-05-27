class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int st = -1, end = -2;
        int maxseen = nums[0];
        int minseen = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {

            // Check if it's smaller than the max seen SO FAR (excluding itself)
            if (nums[i] < maxseen) {
                end = i;
            }
            // Then update the max seen to include this element for the next iterations
            maxseen = Math.max(maxseen, nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] > minseen) {
                st = i;
            }
            minseen = Math.min(minseen, nums[i]);
        }
        return end - st + 1;
    }
}