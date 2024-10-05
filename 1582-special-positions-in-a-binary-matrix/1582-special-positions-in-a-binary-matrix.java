class Solution {
    public int numSpecial(int[][] mat) {
        
        int[] onesRow = new int[mat.length];
        int[] onesCol = new int[mat[0].length];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        
        int output = 0;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && onesRow[i] == 1 && onesCol[j] == 1) {
                    output++;
                }
            }
        }
        
        return output;
        
    }
}