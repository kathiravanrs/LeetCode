class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String w: words){
            map.put(w, map.getOrDefault(w,0)+1);
        }
        TreeMap<Integer, List<String>> m = new TreeMap<>(Collections.reverseOrder());
        for(String w: map.keySet()){
            int i = map.get(w);
            List<String> l = m.getOrDefault(i, new ArrayList<>());
            l.add(w);
            Collections.sort(l);
            m.put(i, l);
        }

        List<String> res = new ArrayList<>();
        int count = 0;
        for(int i: m.keySet()){
            List<String> l = m.get(i);
            for(String w: l){
                count++;
                res.add(w);
                if(count==k) return res;
            }
        }
        
        return null;
    }
}