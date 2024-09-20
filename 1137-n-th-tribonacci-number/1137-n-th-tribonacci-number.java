class Solution {
    public int tribonacci(int n) {
        
        int a = 0;
        int b = 1;
        int c = 1;
        
        int output = 0;
        
        if (n == 0) {
            return output;
        } else if (n == 1 || n == 2) {
            output = 1;
            return output;
        } 
        
        for (int i = 0; i < n - 2; i++) {
            output = a + b + c;
            a = b;
            b = c;
            c = output;
        }
        
        return output;
        
    }
}