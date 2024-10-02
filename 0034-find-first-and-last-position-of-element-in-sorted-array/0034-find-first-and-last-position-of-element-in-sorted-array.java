class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] output = new int[2];
        
        boolean exists = false;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == target) {
                exists = true;
                break;
            }
        }
        
        if (!exists) {
            output[0] = -1;
            output[1] = -1;
            return output;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                output[0] = i;
                break;
            }
        }
        
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                output[1] = j;
                break;
            }
        }
        
        return output;
        
    }
}