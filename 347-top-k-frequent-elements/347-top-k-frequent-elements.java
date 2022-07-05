class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> countMap = new TreeMap<>(Collections.reverseOrder());
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int val : map.keySet()) {
            int count = map.get(val);
            List<Integer> l = countMap.getOrDefault(count, new ArrayList<>());
            l.add(val);
            countMap.put(count, l);
        }
        System.out.println(countMap);
        int[] res = new int[k];
        int i = 0;
        for (int num : countMap.keySet()) {
            List<Integer> l = countMap.get(num);
            for (int a : l) {
                res[i] = a;
                i++;
                if (i == k) break;
            }
                            if (i == k) break;

        }
        return res;
    }
}
