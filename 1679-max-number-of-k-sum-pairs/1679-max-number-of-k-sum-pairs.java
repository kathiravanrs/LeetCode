class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: nums){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int c = 0;
        System.out.println(map);
        for(int a: map.keySet()){
            // if(a==k) c = c + map.get(a);
            if(a<k){
                double z = ((double) k )/2;
                if(z==a){
                    c = c + map.get(a)/2;
                }
                else if(map.containsKey(k-a)){
                    c = c + Math.min(map.get(a), map.get(k-a));
                    map.put(a, 0);
                }
            }
        }
        return c;
    }
}