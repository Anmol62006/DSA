class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num); 
            end += num;                  
        }

    
        int ans = end;
        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (canSplit(nums, mid, k)) {
                ans = mid;    
                end = mid - 1;  
            } else {
                start = mid + 1;  
            }
        }
        return ans;
    }

    
    private boolean canSplit(int[] nums, int limit, int k) {
        int tukdeCount = 1; 
        int currentSum = 0;

        for (int num : nums) {
            
            if (currentSum + num > limit) {
                tukdeCount++;      
                currentSum = num;  
            } else {
                currentSum += num; 
            }
        }
        return tukdeCount <= k;
    }
}
