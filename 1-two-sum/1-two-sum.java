class Solution {
    public int[] twoSum(int[] nums, int target) {

        // for(int i=0; i<nums.length-1;i++){
        //     int index1 = i;
        //     for(int j=i+1; j<nums.length;j++){
        //        int index2 = j;
        //         if(nums[index1]+nums[index2]==target) {
        //             return new int[]{index1,index2};    
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])) return new int[]{i,map.get(target-nums[i])};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}