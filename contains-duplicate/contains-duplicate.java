class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i: nums){
            if(!map.add(i)) return true;
        }
        return false;
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]) return true;
        // }
        // return false;
    }
}