class Solution {
    public void rotate(int[] nums, int k) {
        int i=0,
            j=nums.length-1;
        k=k % nums.length;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=0;
        int l=k;
        while(i<k-1){
            int temp=nums[i];
            nums[i]=nums[k-1];
            nums[k-1]=temp;
            i++;
            k--;
        }

        j=nums.length-1;
        while(l<j){
            int temp=nums[l];
            nums[l]=nums[j];
            nums[j]=temp;
            l++;
            j--;
        }
    }
}