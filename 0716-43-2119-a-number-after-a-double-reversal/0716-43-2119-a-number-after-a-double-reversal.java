class Solution {
    public boolean isSameAfterReversals(int num) {
        int origNum = num;
        int reverse1 = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            reverse1 = reverse1 * 10 + digit;
        }
        
        int reverse2 = 0;
        while (reverse1 != 0) {
            int digit = reverse1 % 10;
            reverse1 /= 10;
            reverse2 = reverse2 * 10 + digit;
        }

        return origNum == reverse2;
    }
}