class Solution {
    public String minWindow(String s, String t) {
      if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int required = mapT.size();
        int formed = 0;

        HashMap<Character, Integer> windowMap = new HashMap<>();

        int left = 0, right = 0;
        int[] ans = {-1, 0, 0}; // length, left, right

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (mapT.containsKey(c) && 
                windowMap.get(c).intValue() == mapT.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                c = s.charAt(left);

                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                windowMap.put(c, windowMap.get(c) - 1);
                if (mapT.containsKey(c) && 
                    windowMap.get(c) < mapT.get(c)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}