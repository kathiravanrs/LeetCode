class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>,List<String>> map = new HashMap<>();
        for(String s:strs){
            Map<Character, Integer> str = new HashMap<>();
            for(char a: s.toCharArray()){
                str.put(a, str.getOrDefault(a, 0)+1);
            }
            List<String> l = map.getOrDefault(str, new ArrayList<String>());
            // if(map.containsKey(str)) map.get(str).add(s);
            // else map.put(str, new ArrayList<String>(Arrays.asList(s)));
            l.add(s);
            map.put(str, l);
        }
        // System.out.println(map);
        List<List<String>> list = new ArrayList<>();
        for(List<String> l:map.values()){
            list.add(l);
        }
        return list;
    }
}