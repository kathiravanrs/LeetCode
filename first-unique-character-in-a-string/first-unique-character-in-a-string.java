class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        int pos = Integer.MAX_VALUE;
        boolean found = false;
        for(char c: map.keySet()){
            if(map.get(c)==1) {
                pos = Math.min(pos, s.indexOf(c));
            found = true;}
        }
        if(!found) return -1;
        return pos;
    }
}