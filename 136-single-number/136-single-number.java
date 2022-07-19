class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int a:nums){
            if(set.contains(a)) set.remove(a);
            else set.add(a);
        }
        for(int a: set){
            return a;
        }
                    return 0;
    }
}