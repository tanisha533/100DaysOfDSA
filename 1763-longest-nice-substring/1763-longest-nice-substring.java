class Solution {
    public String longestNiceSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (set.contains(Character.toLowerCase(c)) &&
                set.contains(Character.toUpperCase(c))) {
                continue;
            }

            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            return left.length() >= right.length() ? left : right;
        }

        return s;
    }
}