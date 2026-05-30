class Solution {
    public int balancedStringSplit(String s) {
        int l=0, r=0; int ans=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='L') l++;
             else if(ch=='R'){ r++;
            }
            if(l==r) {ans++; }
        }
        return ans++;
    }
}