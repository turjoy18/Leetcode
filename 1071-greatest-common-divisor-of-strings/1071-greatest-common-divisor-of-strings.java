class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        
        int gcdLen = gcdFinder(len1, len2);
        
        String output = str1.substring(0, gcdLen);
        
        if (isDivisible(str1, output) && isDivisible(str2, output)) {
            return output;
        }
        
        return "";
        
    }
    
    public int gcdFinder(int len1, int len2) {
        while (len2 != 0) {
            int temp = len2;
            len2 = len1 % len2;
            len1 = temp;
        } 
        return len1;
    }
    
    public boolean isDivisible(String str, String divisor) {
        if (str.length() % divisor.length() !=  0)
            return false;
        
        int repeat = str.length() / divisor.length();
        String ans = "";
        
        for (int i = 0; i < repeat; i++) {
            ans += divisor;
        }
        
        return ans.equals(str);
        
    }
    
}