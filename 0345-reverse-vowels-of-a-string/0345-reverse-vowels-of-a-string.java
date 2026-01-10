class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int st = 0, end = arr.length - 1;

        while (st < end) {
            if (!isVowel(arr[st])) {
                st++;
            } else if (!isVowel(arr[end])) {
                end--;
            } else {
                // swap vowels
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        
        return c == 'a' || c == 'e' || c == 'i' || c ==    'o' || c == 'u';
    
    }
}
