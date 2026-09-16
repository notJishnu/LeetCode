class Solution {
    public String reverseWords(String s) {
        String[] res=s.split(" ");
        int left=0,
            right=res.length-1;
        
        while(left<right){
            String temp=res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
        }
        String result="";
        for(int i=0;i<res.length;i++){
            result += res[i] + " ";
        }
        return result.strip().replaceAll("\\s+", " ");
        
    }
}