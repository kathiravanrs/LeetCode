class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
    
            if(m.getValue() > nums.length/2) return m.getKey();
        }
        return 0;
    }
}