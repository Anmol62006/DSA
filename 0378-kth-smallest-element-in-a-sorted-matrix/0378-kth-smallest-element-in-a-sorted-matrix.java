class Solution {
    public static int counting(int[][] matrix, int target) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= target) count++;
            }
        }
        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = counting(matrix, mid);
            if (count < k) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}