import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        
        Set<Integer> primeFactors = new HashSet<>();
        
        for (int num : nums) {
            findPrimeFactors(num, primeFactors);
        }
        
        return primeFactors.size();
        
    }
    
    void findPrimeFactors(int num, Set<Integer> primeFactors) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && num % i == 0) {
                primeFactors.add(i);
            }
        }
    }
    
    boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
}