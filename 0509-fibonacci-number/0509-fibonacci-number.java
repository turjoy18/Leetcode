class Solution {
    public int fib(int n) {
        
        int a = 0;
        int b = 1;
        
        int ways = 0;
        if (n >= 3) {
            for (int i = 0; i < n - 1; i++) {
                ways = a + b;
                a = b;
                b = ways;
            }
        } else {
            switch (n) {
                case 0: break;
                case 1: 
                case 2: ways = 1; break;
            }
        }
        return ways;
        
    }
}