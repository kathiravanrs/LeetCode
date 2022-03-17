class Solution {
    public boolean inc(int[] nums){
        int pre = nums[0];
        for(int a: nums){
            if(a<pre) return false;
            else{
                pre = a;
            }
        }
        return true;
    }
    public boolean dec(int[] nums){
        int pre = nums[0];
        for(int a: nums){
            if(a>pre) return false;
            else{
                pre = a;
            }
        }
        return true;
    }
    
    public boolean isMonotonic(int[] nums) {
        // if(nums.length ==1)return true;
        // int prev = nums[0];
        // if(nums[0]>nums[1]){
        //     for(int a:nums){
        //         if(a<=prev){
        //             prev = a;
        //         }
        //         else return false;
        //     }
        // }
        // else{
        //     for(int a:nums){
        //         if(a>=prev){
        //             prev = a;
        //         }
        //         else return false;
        //     }
        // }
        // return true;
        
        if(nums.length==1) return true;
        
        return (inc(nums)||dec(nums));
        
    }
}