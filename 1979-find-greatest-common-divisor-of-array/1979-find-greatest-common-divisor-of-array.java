class Solution {
    public int findGCD(int[] nums) {
        
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i])  
                min = nums[i];
        }
        
        int gcd = 1;
        for (int i = min; i > 1; i--) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
                break;
            }
        }  
        
        return gcd;
        
    }
}