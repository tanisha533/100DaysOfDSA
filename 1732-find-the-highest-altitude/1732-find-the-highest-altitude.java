class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int high=0;
        for(int i=0; i<gain.length; i++){
           curr+=gain[i];
            
           high=Math.max(high,curr);
        }
        return high;
    }
}