import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        
        if (count >= 3) {
            return nums[count - 3];
        } else {
            return nums[count - 1];
        }
        
    }
}