class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int res[] = new int[nums.length];
        int sq1=0;
        int sq2=0;
        int max = 0;
        for (int x = nums.length-1; x>=0;x--){
            sq1 = nums[i]*nums[i];
            sq2 = nums[j]*nums[j];
            
            if (sq1>=sq2){
                max = sq1;
                i++;
            }
            else if(sq2>sq1){
                max = sq2;
                j--;
            }
            res[x] = max;
        }
        return res;
    }
}