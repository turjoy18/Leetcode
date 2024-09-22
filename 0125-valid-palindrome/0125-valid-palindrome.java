class Solution {
    public boolean isPalindrome(String s) {
        
        String mod = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = mod.length() - 1;
        
        while (left < right) {
            if (mod.charAt(left) != mod.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
        
    }
}