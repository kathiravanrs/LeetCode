class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> so = new HashMap<>();
        
        for(char a: s.toCharArray()){
            so.put(a, so.getOrDefault(a, 0)+1);
        }
        
        for(char a: t.toCharArray()){
            if(!so.containsKey(a)) return false;
            
            int v = so.get(a)-1;
            if(v==0) so.remove(a);
            else so.put(a, v);
        }
        
        return so.isEmpty();
    }
}