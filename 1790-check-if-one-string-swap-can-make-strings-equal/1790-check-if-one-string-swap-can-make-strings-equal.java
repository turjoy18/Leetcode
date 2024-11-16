class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if (s1.length() != s2.length())
            return false;
        
        List<Integer> diffInds = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) 
                diffInds.add(i);
        }
        
        if (diffInds.size() == 0) {
            return true;
        } else if (diffInds.size() == 2) {
            int i = diffInds.get(0);
            int j = diffInds.get(1);
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        } else {
            return false;
        }
            
    }
}