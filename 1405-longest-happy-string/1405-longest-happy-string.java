class CharacterCount {
    int count;
    char c;

    public CharacterCount(int count, char c) {
        this.c = c;
        this.count = count;
    }
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<CharacterCount> maxheap = new PriorityQueue<CharacterCount>((x, y) -> y.count - x.count);

        if(a>0){
            maxheap.add(new CharacterCount(a,'a'));
        }
        if(b>0){
            maxheap.add(new CharacterCount(b,'b'));
        }
        if(c>0){
            maxheap.add(new CharacterCount(c,'c'));
        }

        StringBuilder sb=new StringBuilder();

        while(!maxheap.isEmpty()){
            CharacterCount maxEle=maxheap.poll();
            int count=maxEle.count;
            char ch=maxEle.c;
            if(sb.length()>=2 && sb.charAt(sb.length()-1)==ch && sb.charAt(sb.length()-2)==ch){
                if(maxheap.isEmpty()){
                    break;
                }
                CharacterCount secondMaxEle=maxheap.poll();

                int sCount=secondMaxEle.count;
                char sC=secondMaxEle.c;

                sb.append(sC);
                sCount--;
                if(sCount>0){
                    maxheap.add(new CharacterCount(sCount,sC));
                }
            }else{
                sb.append(ch);
                count--;
                
            }
            if(count>0){
                maxheap.add(new CharacterCount(count,ch));
            } 
        }
        return sb.toString();
    }
}