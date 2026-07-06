class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];

        int[][] arr = new int[n][2];

        // Storing score at col 1 and original index at col 2
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        // Sort by score in descending order
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Assign ranks
        for (int i = 0; i < n; i++) {
            int index = arr[i][1];

            if (i == 0) {
                ans[index] = "Gold Medal";
            } else if (i == 1) {
                ans[index] = "Silver Medal";
            } else if (i == 2) {
                ans[index] = "Bronze Medal";
            } else {
                ans[index] = String.valueOf(i + 1);
            }
        }
        return ans;
    }
}