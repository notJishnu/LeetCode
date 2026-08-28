class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shifts=0;
        while(left<right){
            left=left>>1;
            right=right>>1;
            shifts++;
        }
        for(int i=0;i<shifts;i++){
            left=left<<1;
        }
        return left;
    }
}