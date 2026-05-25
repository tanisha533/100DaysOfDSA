class Solution {
    public int[] shortestToChar(String s, char c) {
        char arr[]= s.toCharArray();
        int ans[]=new int[s.length()];

        int lastSeenC = -10000;; 

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == c) {
            lastSeenC = i;
        }
    
    // The distance from the current index to that last seen 'c' is just (i - lastSeenC)
        ans[i] = i - lastSeenC;
        }
        lastSeenC=10000;;
        for(int j=s.length()-1; j>=0; j--){
             if (arr[j] == c) {
            lastSeenC = j;
        }
          ans[j] =Math.min(ans[j], lastSeenC-j);
        }

        return ans;
    }
}