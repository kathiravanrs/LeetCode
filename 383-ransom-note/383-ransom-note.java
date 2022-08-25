class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char a: magazine.toCharArray()){
            if(map.containsKey(a)) map.replace(a, map.get(a)+1);
            else map.put(a, 1);
        }
        for(char b: ransomNote.toCharArray()){
            if(map.containsKey(b)) {
                if(map.get(b)>1)    map.replace(b, map.get(b)-1);
                else map.remove(b);
            }
            else return false;
        }
        return true;
    }
}