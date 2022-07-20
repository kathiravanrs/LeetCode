class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int cur = nums[i];
            List<List<Integer>> pairs = twoSum(nums, i+1, -cur);
            for(List<Integer> l: pairs){
                if(!l.isEmpty()) ans.add(l);
            }
        }
        return new ArrayList<List<Integer>>(ans);
    }
    public List<List<Integer>> twoSum(int[] nums, int l, int t){
        List<List<Integer>> list = new ArrayList<>();
        int r = nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==t){
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[l]);
                pair.add(nums[r]);
                pair.add(-t);
                Collections.sort(pair);
                list.add(pair);
            }
            if(nums[l]+nums[r]>t) r--;
            else l++;
        }
        return list;
    }
}