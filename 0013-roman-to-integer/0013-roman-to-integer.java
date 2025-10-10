class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = mp.get(ch);

            if (i + 1 < s.length() && value < mp.get(s.charAt(i+1))) {
                sum -= value; // subtract if smaller
            } else {
                sum += value; // else add
            }

        }
        return sum;
    }
}