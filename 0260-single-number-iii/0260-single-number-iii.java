class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int element : nums) {
            xor = xor ^ element;

        }
        int mask = (xor & xor - 1) ^ xor;
        int[] res=new int[2];
        for (int ele : nums) {
            if((mask & ele) == 0){
                res[0]= res[0] ^ ele;
            }else{
                res[1]= res[1] ^ ele;
            }
        }
        return res;
    }
}