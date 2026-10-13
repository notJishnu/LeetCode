class Solution {
    public void rotate(int[] nums, int k) {
        int[] res=new int[nums.length];
        int pos=nums.length - (k % nums.length);
        int j=0;
        
        for(int i=pos;i<nums.length;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i<pos;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i<res.length;i++){
            nums[i]=res[i];
        }
    }
}