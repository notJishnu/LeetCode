class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int add : nums){
            sum2 += add;
        }
        return sum-sum2;
    }
}