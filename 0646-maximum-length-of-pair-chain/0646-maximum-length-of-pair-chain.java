class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs,
         Comparator.comparingDouble(o -> o[1]));
        int maxLen=1;
        int chainEnd=pairs[0][1]; //last selected pair end//chain end
        for(int i=1; i<pairs.length; i++){
            if(chainEnd < pairs[i][0]){
                maxLen++;
                chainEnd=pairs[i][1];
            }
        }
        return maxLen;
    }
}