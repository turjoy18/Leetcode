class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int[] count = new int[51];
        int ans = 0;
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 2) {
                ans ^= i;
            }
        }
        
        return ans;
        
    }
}