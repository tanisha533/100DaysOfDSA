class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum=0.0000;
        double avg=0.0000;
        for(int i=0; i<k; i++){
            windowSum+=nums[i];
        }
        avg=windowSum/k;

          int left = 0;
        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];      // add new element
            windowSum -= nums[left];       // remove old element
            left++;                        // move window ahead
 
            avg= Math.max(avg, windowSum/k);

        }
        return avg;
    }
}