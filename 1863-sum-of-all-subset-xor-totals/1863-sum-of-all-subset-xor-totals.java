class Solution {
    public int subsetXORSum(int[] nums) {
        int totalXor=0;
        for(int num: nums){
            totalXor=totalXor | num;
        }
        return totalXor * (int)Math.pow(2,nums.length-1);
    }
}