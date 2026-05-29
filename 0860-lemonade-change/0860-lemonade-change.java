class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                // To change a $10, we absolutely need a $5
                if (five == 0) return false;
                five--;
                ten++;
            } else { // bill == 20
                // Prefer giving one $10 and one $5 first (Greedy)
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) { // Otherwise, use three $5 bills
                    five -= 3;
                } else {
                    return false;
                }
            }
        }return true;
        }}