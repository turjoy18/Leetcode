class Solution {
    public boolean isThree(int n) {
        
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n)
            return false;
        
        return isPrime(sqrt);
        
    }
    
    public boolean isPrime(int p) {
        if (p <= 1)
            return false;
        
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0)
                return false;
        }
        
        return true;
        
    }
    
}