class Solution {
    public int minOperations(int n) {
        
        int sum = 0;
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = 2 * i + 1;
            sum += nums[i];
        }
        
        int target = sum / n;
        
        int minOp = 0;
        for (int i = 0; i < n / 2; i++)
            minOp += target - nums[i];
        
        return minOp;
        
    }
}