class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reverse > (Integer.MAX_VALUE - digit) / 10) return 0;
            reverse = reverse * 10 + digit;
        }
        
        return reverse * sign;
    }
}