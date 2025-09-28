class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int left = 0, right = m * n - 1;

        while(left<=right){
             int mid = left + (right - left) / 2;
            
            // Map mid index to matrix coordinates
            int midValue = matrix[mid / n][mid % n]; //flatten matrix to 1d array
     if (midValue == target) return true;
            else if (midValue < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}