class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,1);
        int runningSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            runningSum += nums[i];
            int target=runningSum-k;
            if(prefixSum.containsKey(target)){
                count += prefixSum.get(target);
            }
            prefixSum.put(runningSum,prefixSum.getOrDefault(runningSum,0)+1);
        }
        return count;
    }
}