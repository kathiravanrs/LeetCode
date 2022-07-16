class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(map.containsKey(a) && i-map.get(a)<=k) return true;
            else map.put(a, i);
        }
        return false;
    }
}