class Solution {
    public boolean isPowerOfTwo(int n) {
        int y=n&(n-1);
        if(n>0 && y==0){
            return true;
        }else{
            return false;
        }
    }
}