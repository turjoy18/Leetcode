class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        int maxLength = 0;
        
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] % 2 == 0 && nums[l] <= threshold) {
                int currentLength = 1;
                int prevParity = nums[l] % 2;
            
                for (int r = l + 1; r < nums.length; r++) {
                    if (nums[r] <= threshold && nums[r] % 2 != prevParity) {
                        currentLength++;
                        prevParity = nums[r] % 2;
                    } else {
                        break;
                    }
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
        
    }
}