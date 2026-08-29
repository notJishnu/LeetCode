class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetXor(nums,0,0);
    }
    public int subsetXor(int[] nums,int index,int xor){
        if(index==nums.length) return xor;
        int pick=subsetXor(nums, index+1, xor ^ nums[index]);
        int nopick=subsetXor(nums, index+1, xor);
        return pick+nopick;
    }
}