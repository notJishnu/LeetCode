class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        if(set.size() < 3){
            return Collections.max(set);
        }
        for(int i=1;i<=2;i++){
            set.remove(Collections.max(set));
        }

        return Collections.max(set);
    }
}