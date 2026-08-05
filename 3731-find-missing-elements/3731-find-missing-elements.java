class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List <Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int min=nums[0],
            max=nums[0];
        for(int n:nums){
            if(n>max)max=n;

            if(n<min)min=n;
        }

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}