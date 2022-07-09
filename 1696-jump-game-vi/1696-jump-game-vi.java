class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] score = new int[n];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->b[0]-a[0]);
        score[0] = nums[0];
        q.add(new int[]{score[0],0});
        for(int i=1;i<n;i++){
            while(q.peek()[1]<i-k){
                q.remove();
            }
            score[i] = nums[i] + q.peek()[0];
            q.add(new int[]{score[i], i});
        }
        return score[n-1];
        
    }
}