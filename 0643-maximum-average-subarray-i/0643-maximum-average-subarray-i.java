class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        double maxAvg=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=sum/k;
        for(int j=k;j<nums.length;j++){
            sum=sum+nums[j];
            sum=sum-nums[j-k];
            maxAvg=Math.max(maxAvg,sum/k);
        }
        return maxAvg;

    }
}