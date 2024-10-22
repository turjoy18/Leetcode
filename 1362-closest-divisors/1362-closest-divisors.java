class Solution {
    public int[] closestDivisors(int num) {
        
        int case1 = num + 1;
        int case2 = num + 2;
        
        int[] bestFactors1 = findBestFactors(case1);
        int[] bestFactors2 = findBestFactors(case2);
        
        int diff1 = Math.abs(bestFactors1[0] - bestFactors1[1]);
        int diff2 = Math.abs(bestFactors2[0] - bestFactors2[1]);
        
        return (diff1 < diff2) ? bestFactors1 : bestFactors2;
        
    }
    
    public int[] findBestFactors(int target) {
        int[] factors = new int[2];
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 1; i * i <= target; i++) {
            if (target % i == 0) {
                factors[0] = i;
                factors[1] = target / i;
            }
        }
        
        return factors;
        
    }
    
}