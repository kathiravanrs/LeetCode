class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = -1;
        for(int a: nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()==1) m = Math.max(m, e.getKey());
        }
        return m;
    }
}