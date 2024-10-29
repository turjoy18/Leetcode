class Solution {
    public int subarrayGCD(int[] nums, int k) {
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int currentGCD = 0;
            for (int j = i; j < nums.length; j++) {
                currentGCD = gcd(currentGCD, nums[j]);
                if (currentGCD == k)
                    count++;
                else if (currentGCD < k)
                    break;
            }
        }
        return count;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; 
    }
}