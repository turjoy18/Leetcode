class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int[][] diff = new int[grid.length][grid[0].length];
        
        int[] onesRow = new int[grid.length];
        int[] onesCol = new int[grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        
        int[] zerosRow = new int[grid.length];
        int[] zerosCol = new int[grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            zerosRow[i] = grid[0].length - onesRow[i]; 
        }
        
        for (int j = 0; j < grid[0].length; j++) {
            zerosCol[j] = grid.length - onesCol[j];
        }
        
        for (int i = 0; i < diff.length; i++) {
            for (int j = 0; j < diff[i].length; j++) {                
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }
        
        return diff;
        
    }
}