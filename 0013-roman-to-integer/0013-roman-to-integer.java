class Solution {
    public int romanToInt(String s) {

        char ch = 0;
        int code = 0;
        ArrayList<Integer> result = new ArrayList<>(); 
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i); 
            switch (ch) {
                case 'I': code = 1;
                          break;
                case 'V': code = 5;
                          break;
                case 'X': code = 10;
                          break;
                case 'L': code = 50;
                          break;
                case 'C': code = 100;
                          break;
                case 'D': code = 500;
                          break;
                case 'M': code = 1000;
                          break; 
            } 
            result.add(code);
        }

        int output = 0;
        for (int i = 0; i < result.size(); i++) {
            int current_element = result.get(i);
            if (i + 1 < result.size()) {
                int next_element = result.get(i + 1);

                if (next_element <= current_element) {
                    output += current_element;
                } else {
                    output -= current_element;
                }
            } else {
                output += current_element;
            }
        }
        return output;
        
        
    }
}