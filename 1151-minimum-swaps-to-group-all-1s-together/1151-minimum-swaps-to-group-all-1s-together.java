class Solution {
    public int minSwaps(int[] data) {
        int ones = 0;
        for(int a:data){
            if(a==1) ones++;
        }
        int ans = Integer.MAX_VALUE;
        
        int zeros = 0;
        for(int i= 0;i<ones;i++){
            if(data[i] ==0) zeros++;
        }
        ans = Math.min(zeros, ans);
        
        for(int i = ones;i<data.length;i++){
            if(data[i]==0) zeros++;
            if(data[i-ones]==0) zeros--;
                    ans = Math.min(zeros, ans);

        }
        
        return ans;
    }
}