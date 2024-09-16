import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger a_num = new BigInteger(a, 2);
        BigInteger b_num = new BigInteger(b, 2);
        
        BigInteger sum = a_num.add(b_num);
        
        String result = sum.toString(2);
        
        return result;
        
    }
}