class Solution {
    public int connectSticks(int[] sticks) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a: sticks) pq.add(a);
        while(pq.size()>1){
            int sum = pq.poll() + pq.poll();
            cost += (sum);
            pq.add(sum);
        }
        return cost;
    }
}