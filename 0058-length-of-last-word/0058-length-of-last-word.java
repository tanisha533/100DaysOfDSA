class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        int ei=s.length()-1;
        
        // Skip trailing spaces
        while (ei >= 0 && s.charAt(ei) == ' ') {
            ei--;
        }
        while (ei >= 0 && s.charAt(ei) != ' '){
            len++;
            ei--;
        }
        return len;
    }
}