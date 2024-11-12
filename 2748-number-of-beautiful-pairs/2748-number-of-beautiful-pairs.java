class Solution {
    public int countBeautifulPairs(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int firstDigit = findFirstDigit(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                int lastDigit = findLastDigit(nums[j]);
                if (gcd(firstDigit, lastDigit) == 1)
                    count++;
            }
        }
        
        return count;
        
    }
    
    public int findFirstDigit(int num) {
        while (num >= 10)
            num /= 10;
        return num;
    }
    
    public int findLastDigit(int num) {
        return num % 10;
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