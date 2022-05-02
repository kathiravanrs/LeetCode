class Solution {

    public int rob(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        return r(nums, 0, map);
    }

    public int r(int[] nums, int l, Map<Integer, Integer> map) {
        if (!map.containsKey(l)){
            if (nums.length - l == 1) {
                map.put(l, nums[l]);
            }
            else if (nums.length - l == 2) {
                map.put(l, Math.max(nums[l], nums[l + 1]));
            }
            else {
                map.put(l, Math.max(nums[l] + r(nums, l + 2, map), r(nums, l + 1, map)));
            }
        }
        return map.get(l); 
    }
}
