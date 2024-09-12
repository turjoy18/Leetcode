class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int indexToInsert = 0;
        
        while (indexToInsert < nums.length && nums[indexToInsert] < target) {
            indexToInsert++;
        }
        
        boolean cond = false;
        int possible_output = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                possible_output = i;
                cond = true;
                break;
            }
        }
        
        if (cond) {
            return possible_output;
        } else {
            return indexToInsert;
        }
        
    }
}