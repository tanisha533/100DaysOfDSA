class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;

        // Sliding window
        for (int right = k; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                count++;
            }
            if (isVowel(s.charAt(right - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
