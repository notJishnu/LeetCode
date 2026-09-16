class Solution {
    public String reverseWords(String s) {
        String[] res = s.trim().split("\\s+");
        int left = 0, right = res.length - 1;

        while (left < right) {
            String temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", res);
    }
}