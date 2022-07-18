class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        Map<Integer, Set<String>> countMap = new TreeMap<>(Collections.reverseOrder());
        for(String s: map.keySet()){
            int count = map.get(s);
            Set<String> set = countMap.getOrDefault(count, new TreeSet<>());
            set.add(s);
            countMap.put(count, set);
        }
        
        for(Set<String> set: countMap.values()){
            for(String s: set) {
                ans.add(s);
                k--;
                if(k==0) return ans;

            }
        }
        
        return ans;   
    }
}