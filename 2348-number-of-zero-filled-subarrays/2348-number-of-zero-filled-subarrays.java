class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long zeroCount = 0;
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                count += zeroCount * (zeroCount + 1) / 2;
                zeroCount = 0;
            }
        }
        
        count += zeroCount * (zeroCount + 1) / 2;
        
        return count;
        
    }
}