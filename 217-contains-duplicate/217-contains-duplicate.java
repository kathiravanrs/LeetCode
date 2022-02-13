class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i: nums){
            if(map.contains(i)) return true;
            else map.add(i);
        }
        return false;
    }
}