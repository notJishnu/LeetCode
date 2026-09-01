class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res=0;
        int n=nums1.length,
            m=nums2.length;
        if(n%2!=0){
            for(int val : nums2){
                res ^= val;
            }
        }

        if(m%2!=0){
            for(int val : nums1){
                res ^= val;
            }
        }

        return res;
    }
}