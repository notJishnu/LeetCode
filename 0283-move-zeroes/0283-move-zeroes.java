class Solution {
    public void moveZeroes(int[] nums) {
        int[] res=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}