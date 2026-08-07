class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int j = 0; j < nums.length; j++) {
            if (window.contains(nums[j])) {
                return true; // duplicate found within window of size k
            }

            window.add(nums[j]);

            // keep window size at most k
            if (window.size() > k) {
                window.remove(nums[j - k]);
            }
        }

        return false;
    }
}