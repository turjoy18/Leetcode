class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        int min = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < min) {
                min = nums[j];
            }
        }
        
        
        int output = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != max && nums[k] != min) {
                output = nums[k];
            }
        }
        
        if (nums.length <= 2) {
            return -1;
        } else {
            return output;
        }
        
    }
}