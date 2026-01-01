class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder sb = new StringBuilder();
        int j=0, i=0;
       while (i < w1.length() || j < w2.length()) {
            if (i < w1.length()) {
                sb.append(w1.charAt(i));
                i++;
            }
            if (j < w2.length()) {
                sb.append(w2.charAt(j));
                j++;
            }
        }
    return sb.toString();
    }
}