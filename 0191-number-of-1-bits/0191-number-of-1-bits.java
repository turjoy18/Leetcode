class Solution {
    public int hammingWeight(int n) {
        
        String korkma = Integer.toBinaryString(n);
        int bin = (1 << korkma.length()) - 1;
        
        int ans = n & bin;
        String output = Integer.toBinaryString(ans);
        int count = 0;
        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '1') {
                count++;
            }
        }
        
        return count;
        
    }
}