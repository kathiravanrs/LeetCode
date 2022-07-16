class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i), y= t.charAt(i);
            if(map1.containsKey(x)) l1.add(map1.get(x));
            else {
                map1.put(x, i);
                l1.add(i);
            }
            
            if(map2.containsKey(y)) l2.add(map2.get(y));
            else {
                map2.put(y, i);
                l2.add(i);
            }
        }
        return l1.equals(l2);
        
    }
}