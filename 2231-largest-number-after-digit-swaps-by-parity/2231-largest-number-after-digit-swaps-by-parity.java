class Solution {
    public int largestInteger(int num) {
        char arr[] = Integer.toString(num).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max] && (arr[i] - arr[j]) % 2 == 0) {
                    max = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        return Integer.parseInt(new String(arr));
    }
}