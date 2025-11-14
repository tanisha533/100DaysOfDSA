class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // important: prefixSum = 0 before starting

        int prefixSum = 0;
        int maxLen = 0;
           for(int i = 0; i < nums.length; i++) {

            // Convert 0 → -1, keep 1 as +1
            if(nums[i] == 0) prefixSum += -1;
            else prefixSum += 1;

            // If prefixSum seen before → subarray sum = 0
            if(map.containsKey(prefixSum)) {
                int len = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, len);
            } 
            else {
                // store first occurrence
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}