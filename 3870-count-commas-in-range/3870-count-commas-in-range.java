class Solution {
    public int countCommas(int n) {
        int ans = 0;
        int low = 1;  
        int high = 9;  
        int d = 1;
        while (low <= n) {
            int count = Math.min(n, high) - low + 1;
            int commasPerNumber = (d - 1) / 3;
            ans += count * commasPerNumber;

            low = high + 1;
            high = high * 10 + 9;
            d++;
        }

        return ans;
    }
}