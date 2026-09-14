class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // find actual min and max
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = high - (high - low) / 2;
            int count = 0;

            for (int num : nums) {
                if (num >= mid) count++;
            }

            if (count >= k) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
