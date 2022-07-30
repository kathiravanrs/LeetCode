class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character, Integer> map = new HashMap<>();
        for(String b: words2){
            Map<Character, Integer> temp = new HashMap<>();
            for(char c: b.toCharArray()) temp.put(c, temp.getOrDefault(c,0)+1);
            for(char c: temp.keySet()){
                if(map.containsKey(c)) map.put(c, Math.max(temp.get(c), map.get(c)));
                else map.put(c, temp.get(c));
            }
        }
        
        List<String> ans = new ArrayList<>();
        for(String a: words1){
            Map<Character, Integer> temp = new HashMap<>();
            for(char c: a.toCharArray()) temp.put(c, temp.getOrDefault(c,0)+1);
            boolean flag = true;
            for(char c: map.keySet()){
                if(!temp.containsKey(c) || temp.get(c)<map.get(c)){
                    flag = false;
                    break;
                }
                
            }
            if(flag) ans.add(a);
        }
        return ans;
    }
}