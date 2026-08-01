class Solution {
    public int sumOfSquareDigits(int n){
        int sum=0;

        while(n!=0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,
            fast=n;

        if(sumOfSquareDigits(slow)==1){
            return true;
        }
        while(fast!=1){
            slow=sumOfSquareDigits(slow);
            fast=sumOfSquareDigits(sumOfSquareDigits(fast));
            if(fast==slow){
                return false;
            }
        }
        return true;
        
    }
}