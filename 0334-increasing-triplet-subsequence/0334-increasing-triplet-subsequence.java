class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Set<Integer> s  = new HashSet<>();
        // for(int a: nums) s.add(a);
        // if(s.size()<3) return false;
        // int l = nums.length;
        // for(int i=1;i<l-1;i++){
        //     boolean flag = false;
        //     for(int j=i-1;j>=0;j--){
        //         if(nums[j]<nums[i]){flag = true; break;}
        //     }
        //     if(!flag) continue;
        //     for(int k=i+1;k<l;k++){
        //         if(nums[k]>nums[i]) return true;
        //     }
        // }
        // return false;
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int a: nums){
            if(a<=f) f = a;
            else if(a<=s) s = a;
            else return true;
        }
        return false;
    }
}