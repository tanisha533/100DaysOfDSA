class Solution {
    public boolean isAnagram(String s, String t) {
            s= s.toLowerCase();
            t= t.toLowerCase();

            // first check - if the lengths are the same
        if(s.length()== t.length()){
        char[] sch=s.toCharArray();
        char[] tch=t.toCharArray();

        Arrays.sort(sch);
        Arrays.sort(tch);
       if(Arrays.equals(sch,tch)) return true;
        }
        return false;
    }
}