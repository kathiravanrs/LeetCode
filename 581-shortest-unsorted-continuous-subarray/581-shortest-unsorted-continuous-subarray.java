class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // int l = 0;
        // int r = nums.length;
        List<Integer> ar = new ArrayList<>();
        for(int a:nums){
            ar.add(a);
        }
        Collections.sort(ar);
        int l = nums.length;
        int r = 0;
        boolean sorted = true;
        for(int i = 0;i<nums.length;i++){
            if(ar.get(i)!=nums[i]){
                sorted = false;
                l = Math.min(l, i);
                r = Math.max(r, i);
            }
        }
        if(sorted) return 0;
        return r-l+1;
        
    }
//     public check(int[] nums, int l, int r){
        
//     }
}