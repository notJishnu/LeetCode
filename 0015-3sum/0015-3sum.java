class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicate anchors: if same value as previous i, we'd
            // just find the same triplets again
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            int remainingTarget = 0 - nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == remainingTarget) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < remainingTarget) {
                    left++; // need a bigger sum
                } else {
                    right--; // need a smaller sum
                }
            }
        }
        return result;
    }
}