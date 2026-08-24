class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minheap=new PriorityQueue<>((a,b)-> a[0]- b[0]);
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            minheap.add(new int[]{
                matrix[i][0],
                i,
                0
            });
        }

        int counter=1;
        while(!minheap.isEmpty()){
            int[] ele=minheap.poll();
            int val=ele[0],
                listid=ele[1],
                eleid=ele[2];
            if(counter==k){
                return val;
            }
            counter++;

            int nextEleId=eleid+1;

            if(nextEleId<n){
                minheap.add(new int[]{
                    matrix[listid][nextEleId],
                    listid,
                    nextEleId
                });
            }
        }
        return -1;
    }   
}