class Solution {
    public int smallestEvenMultiple(int n) {
        
        int gcd = gcd(2, n);
        
        return (2 * n) / gcd;
    }
    
    public int gcd(int num, int n) {
        while (n != 0) {
            int temp = n;
            n = num % n;
            num = temp;
        }
        return num;
    }
    
}