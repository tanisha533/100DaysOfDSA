class Solution {
    public int minLength(String s) {
    StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            stack.append(ch);

            int n = stack.length();
            if (n >= 2) {
                String lastTwo = stack.substring(n - 2);
                if (lastTwo.equals("AB") || lastTwo.equals("CD")) {
                    stack.delete(n - 2, n);
                }
            }
        }

        return stack.length();
    }
}