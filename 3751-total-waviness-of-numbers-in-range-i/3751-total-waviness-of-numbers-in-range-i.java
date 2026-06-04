class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for (int j = num1; j <= num2; j++) {
            String s = Integer.toString(j);
            if (s.length() < 3)
                waviness=0;
            for (int i = 1; i < s.length() - 1; i++) {
                int left = s.charAt(i - 1) - '0';
                int curr = s.charAt(i) - '0';
                int right = s.charAt(i + 1) - '0';

                if (curr > left && curr > right)
                    waviness++; // peak
                if (curr < left && curr < right)
                    waviness++; // valley
            }
        }
        return waviness;
    }
}