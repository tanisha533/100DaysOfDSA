class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(m>n) return -1;
        for(int i=0; i<=n-m; i++){
            String window=haystack.substring(i,i+m);

            if(window.equals(needle)){
                return i;
            }
        }
            return -1;
    }
}