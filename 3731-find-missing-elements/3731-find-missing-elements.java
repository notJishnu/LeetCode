class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List <Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int min=nums[0],
            max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)max=nums[i];

            if(nums[i]<min)min=nums[i];
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