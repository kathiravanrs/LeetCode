class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> so = new HashMap<>();
        HashMap<Character, Integer> ta = new HashMap<>();
        
        for(char a: s.toCharArray()){
            so.put(a, so.getOrDefault(a, 0)+1);
        }
        
        for(char a: t.toCharArray()){
            ta.put(a, ta.getOrDefault(a, 0)+1);
        }
        
        if(so.equals(ta))return true;
        return false;
    }
}