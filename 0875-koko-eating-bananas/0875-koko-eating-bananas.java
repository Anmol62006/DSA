class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int  ghanta = 0;
            for (int pile : piles) {
                ghanta += (pile + mid - 1) / mid; 
            }
            if (ghanta<= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
