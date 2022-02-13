class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i: nums){
            map.add(i);
        }
        return map.size()!= nums.length;
    }
}