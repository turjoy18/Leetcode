class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        char[] result = new char[Math.max(num1.length(), num2.length()) + 1];
        int k = result.length - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            result[k] = (char) (sum % 10 + '0');
            carry = sum / 10;
            k--;
        }

        return new String(result, k + 1, result.length - k - 1);
    }
}