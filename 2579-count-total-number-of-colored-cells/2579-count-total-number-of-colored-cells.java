class Solution {
    public long coloredCells(int n) {
        
        if (n > 1) {
            long val = 0;
            for (int i = 1; i < n; i++) {
                val += 4 * i;
            }
            return 1 + val;
        } else {
            return 1;
        }
        
    }
}