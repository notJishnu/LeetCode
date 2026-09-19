class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }else{
                break;
            }
        }
        if(index==0 || index==arr.length-1){
            return false;
        }
        
        int i=index,
            j=index;
        while(i>0 && j<arr.length-1){
            if(arr[i-1]<arr[i]){
                i--;
            }else{
                return false;
            }
            if(arr[j+1]<arr[j]){
                j++;
            }else{
                return false;
            }
        }
        while(i>0){
            if(arr[i-1]<arr[i]){
                i--;
            }else{
                return false;
            }
        }
        while(j<arr.length-1){
            if(arr[j+1]<arr[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
}