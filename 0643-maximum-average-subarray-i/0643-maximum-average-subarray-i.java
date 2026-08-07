class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxSum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int j=k;j<nums.length;j++){
            sum=sum+nums[j];
            sum=sum-nums[j-k];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum/k;

    }
}