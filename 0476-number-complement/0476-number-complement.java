class Solution {
    public int findComplement(int num) {
        
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);

        String complement_binary = "";
        char ch;
        for (int i = 0; i < binary.length(); i++) {
            ch = binary.charAt(i);
            if (ch == '0') {
                ch = '1';
                complement_binary += ch;
            } else if (ch == '1') {
                ch = '0';
                complement_binary += ch;
            }
        }

        int complement_num = Integer.parseInt(complement_binary, 2);
        return complement_num;
        
        
    }
}