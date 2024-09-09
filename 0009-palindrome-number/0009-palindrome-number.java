class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int a = x;
        int reversed = 0;
        while(a != 0) {
            reversed = reversed * 10 + a % 10;
            a /= 10;
        }

        if (x == reversed) {
            return true;
        } else {
            return false;
        }

    }
}