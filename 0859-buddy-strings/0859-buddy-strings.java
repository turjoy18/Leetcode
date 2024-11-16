class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        if (s.length() != goal.length())
            return false;
        
        
        
        List<Integer> diffInds = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) 
                diffInds.add(i);
        }
        
        if (diffInds.size() == 2) {
            int i = diffInds.get(0);
            int j = diffInds.get(1);
            return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
        } else if (diffInds.size() == 0) {
            return hasDuplicateChar(s);
        } 
        
        return false;
        
    }
    
    private boolean hasDuplicateChar(String s) {
        char[] charCount = new char[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
            if (charCount[c - 'a'] > 1) {
                return true;
            }
        }
        return false;
    }
}