class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] goodText = text.split(" ");

        char[] broken = brokenLetters.toCharArray();
        int output = goodText.length;
        
        for (String s : goodText) {
            for (char ch : broken) {
                if (s.indexOf(ch) != -1) {
                    output--;
                    break;
                }
            }
        }
        
        return output;
        
        
    }
}