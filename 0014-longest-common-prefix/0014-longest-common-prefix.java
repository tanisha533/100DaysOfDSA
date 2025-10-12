class Solution {
    public String longestCommonPrefix(String[] strs) {
     String prefix=strs[0];

     for(int i=1; i<strs.length;i++){
        String next=strs[i];
        int count=0;
        while(count<Math.min(prefix.length(),next.length()) && 
           prefix.charAt(count) == next.charAt(count)){
            count++;
           }
           prefix=prefix.substring(0,count);
     }
      return prefix;
     }
}