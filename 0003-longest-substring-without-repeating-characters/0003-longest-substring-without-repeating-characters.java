class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Winst=0, Winend=0;
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        int maxlen= 0;
       while(n>Winend){
            char ch= s.charAt(Winend);
             if(map.containsKey(ch) && map.get(ch)>=Winst){
                Winst=map.get(ch)+1;
            }
          map.put(ch,Winend);
            maxlen=Math.max(maxlen,Winend-Winst+1);
           Winend++;

        }
       return maxlen;
    }
}