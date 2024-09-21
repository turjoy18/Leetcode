class Solution {
    public int maximumDifference(int[] nums) {
        
        int maxDif = 0;
        int max = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max && i != 0) {
                max = nums[i];
            } else {
                int currentDif = max - nums[i];
                maxDif = Math.max(maxDif, currentDif);
            }
        }
        
        if (maxDif <= 0) {
            return -1;
        } else {
            return maxDif;
        }
        
    }
}