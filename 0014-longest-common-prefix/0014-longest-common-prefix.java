class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n=arr.length-1;
        String prefix=arr[0];

        for(int i=1; i<=n;i++){
          String next=arr[i];
           int count =0;
           while(count<Math.min(prefix.length(),next.length()) && prefix.charAt(count)==next.charAt(count)){
            count++;
           }
           prefix=prefix.substring(0,count);
        }
        return prefix;
    }
}