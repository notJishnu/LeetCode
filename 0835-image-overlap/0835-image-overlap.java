class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<int[]> A = new ArrayList<>();
        List<int[]> B = new ArrayList<>();

        // Step 1 & 2: collect coordinates of 1s in each image
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (img1[r][c] == 1) A.add(new int[]{r, c});
                if (img2[r][c] == 1) B.add(new int[]{r, c});
            }
        }

        // Step 3: count offsets between every pair (a in A, b in B)
        Map<String, Integer> offsetCount = new HashMap<>();
        int maxOverlap = 0;

        for (int[] a : A) {
            for (int[] b : B) {
                int dr = b[0] - a[0];
                int dc = b[1] - a[1];
                String key = dr + "," + dc;
                int newCount = offsetCount.getOrDefault(key, 0) + 1;
                offsetCount.put(key, newCount);
                maxOverlap = Math.max(maxOverlap, newCount);
            }
        }

        return maxOverlap;
    }
}