class Solution {
    public String reverseVowels(String s) {
       char[] arr = s.toCharArray();
        int st = 0, e = arr.length - 1;
        
        while (st < e) {
            
            if (!isVowel(arr[st])) {
                st++;
            } 
            else if (!isVowel(arr[e])) {
                e--;
            } else {
                char temp = arr[st];
                arr[st] = arr[e];
                arr[e] = temp;
                st++;
                e--;
            }
        }   
        return new String(arr);
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}