class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> map = new HashSet<>();
        // for(int i: nums){
        //     map.add(i);
        // }
        // return map.size()!= nums.length;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }
}