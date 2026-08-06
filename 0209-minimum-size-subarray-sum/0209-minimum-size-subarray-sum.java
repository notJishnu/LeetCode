class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0;
        int size=Integer.MAX_VALUE;
        for(j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                size=Math.min(size,j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        return (size==Integer.MAX_VALUE) ? 0 : size;
    }
}