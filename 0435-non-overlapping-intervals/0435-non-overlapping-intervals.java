class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,
        Comparator.comparingDouble(o -> o[1]));
        int mini=0;
        int end=intervals[0][1];
        for(int i=1; i<intervals.length; i++){
           if (end <= intervals[i][0]) {
           end = intervals[i][1]; // Overlap nahi hai, toh end badal do
          }         
          else {
          mini++; // Overlap hai, toh interval uda do (end wahi rahega)
          } 
        }
        return mini;
    }
}