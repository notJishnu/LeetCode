class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int s_a = 0,
                s_b = 0,
                s_c = 0;

        StringBuilder sb = new StringBuilder();
        while (true) {
            if (a > 0 && ((s_a < 2 && a >= b && a >= c) ||
                    (s_b == 2 && b >= a && a >= c) ||
                    (s_c == 2 && c >= a && a >= b))) {
                sb.append('a');
                s_a++;
                s_b = 0;
                s_c = 0;

                a--;
            } else if (b > 0 && ((s_b < 2 && b >= a && b >= c) ||
                    (s_a == 2 && a >= b && b >= c) ||
                    (s_c == 2 && c >= b && b >= a))) {
                sb.append('b');
                s_b++;
                s_a = 0;
                s_c = 0;

                b--;
            } else if (c > 0 && ((s_c < 2 && c >= a && c >= b) ||
                    (s_a == 2 && a >= c && c >= b) ||
                    (s_b == 2 && b >= c && c >= a))) {
                sb.append('c');
                s_c++;
                s_a = 0;
                s_b = 0;

                c--;
            } else {
                break;
            }
        }
        return sb.toString();
    }
}