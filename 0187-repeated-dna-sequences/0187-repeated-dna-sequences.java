class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> seen = new HashSet<>();
        Set<String> result = new HashSet<>();
        int k=10;
        int sum=0;

        Map<Character,Integer> map=new HashMap<>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);

        if(s.length()<=10){
            return new ArrayList<String>();
        }

        for(int i=0;i<10;i++){
            int pow=k-i-1;
            sum=sum+(int)Math.pow(4,pow) * map.get(s.charAt(i));
        }

        seen.add(sum);
        
        for(int i=k;i<s.length();i++){
            sum=sum-((int)Math.pow(4,k-1) * map.get(s.charAt(i-k)));
            sum=sum*4;
            sum+=map.get(s.charAt(i));
            if(seen.contains(sum)){
                result.add(s.substring(i-k+1,i+1));
            }
            seen.add(sum);
        }

        return new ArrayList<String>(result);

    }
}