class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for (int a : nums1) {
            m1.put(a, m1.getOrDefault(a, 0) + 1);
        }
        for (int a : nums2) {
            m2.put(a, m2.getOrDefault(a, 0) + 1);
        }
        List<Integer> l = new ArrayList<>();
        for(int a: m1.keySet()){
            int x = m2.getOrDefault(a,0);
            int y = m1.get(a);
            
            for(int i = 0;i<Math.min(x,y);i++){
                l.add(a);
            }
        }
        int[] res = new int[l.size()];
        for(int i = 0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
