class Solution {
    public String addBinary(String a, String b) {
        int n=a.length()-1;
        int m=b.length()-1;
        int carry=0;

        StringBuilder sb =new StringBuilder();
        while (n >= 0 || m >= 0) {
            int t1 = (n >= 0) ? a.charAt(n--) - '0' : 0;
            int t2 = (m >= 0) ? b.charAt(m--) - '0' : 0;

            int sum = t1 + t2 + carry;
            sb.append(sum % 2);   // append the current bit
            carry = sum / 2;      // update carry
        }

        if (carry > 0) {
            sb.append(carry);
        }


        return sb.reverse().toString();
    }
}