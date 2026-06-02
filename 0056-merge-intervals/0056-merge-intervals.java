    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,
            Comparator.comparingDouble( o -> o[0]));
            
            ArrayList<int[]> res=new ArrayList<>();
            int[] currentInterval = intervals[0];
            res.add(currentInterval); 
            for(int i=1; i<intervals.length; i++){
               if(currentInterval[1] >= intervals[i][0]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);

               }
               else{
                currentInterval = intervals[i];
                res.add(currentInterval);
               }
            }
            return res.toArray(new int[res.size()][]);
        }
    }