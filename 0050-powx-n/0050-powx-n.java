class Solution {
    public double myPow(double x, int n) {
        
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        
        long exponent = n;
        if (n < 0) {
            x = 1 / x;
            exponent = -exponent;
        }
        
        double output = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1)
                output *= x;
            x *= x;
            exponent /= 2;
        }
        
        return output;
        
    }
}