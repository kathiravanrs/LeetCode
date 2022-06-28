class Solution {

    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Integer, Integer> m = new TreeMap<>();
        for (int a : map.values()) {
            m.put(a, m.getOrDefault(a, 0) + 1);
        }
        System.out.println(m);

        int del = 0;
        Set<Integer> set = new HashSet<>();
        for (int key : m.keySet()) {

            while(m.get(key)>1 && !set.contains(key)){
                int a = key;
                int val = m.get(key);
                while(m.containsKey(a)|| set.contains(a)){
                    a--;
                }
                del += (key-a);
                if(a>0 && !set.contains(a)){
                    set.add(a);
                }
                m.put(key, val-1);
            }
        }
        return del;
    }
}
