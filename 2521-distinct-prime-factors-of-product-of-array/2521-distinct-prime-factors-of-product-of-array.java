import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        
        Set<Integer> primeFactors = new HashSet<>();
        
        for (int num : nums) {
            int i = 2;
            while (num > 1) {
                if (num % i == 0) {
                    primeFactors.add(i);
                    num /= i;
                } else {
                    i++;
                }
            }
        }
        return primeFactors.size();
    }
}