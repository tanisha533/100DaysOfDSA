class Solution {
    public String reverseWords(String s) {
   String[] words = s.trim().split("\\s+");
        int n = words.length;

        for (int j = 0; j < n / 2; j++) {
            String temp = words[j];
            words[j] = words[n - 1 - j];
            words[n - 1 - j] = temp;

        }
        return String.join(" ", words); // combines all elements in the words array with spaces between them, producing the reversed sentence.

    }
}