class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // 1. skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. optional sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3 & 4. read digits, checking overflow as we go
        long result = 0; // use long to safely detect overflow before casting
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign * result);
    }
}