class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length-1;i=i+2){
            for(int j=0;j<nums[i];j++){
                l.add(nums[i+1]);
            }
        }
        int[] ans = new int[l.size()];
        for(int i =0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}