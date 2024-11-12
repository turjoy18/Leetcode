class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if (nums.length < 3)
            return 0;
        
        int count = 0;
        int diff = nums[1] - nums[0];
        int currentLen = 2;
        
        for (int i = 2; i < nums.length; i++) {
            int currentDiff = nums[i] - nums[i - 1];
            if (currentDiff == diff) {
                currentLen++;
                count += currentLen - 2;
            } else {
                diff = currentDiff;
                currentLen = 2;
            }
        }
        
        return count;
        
    }
}