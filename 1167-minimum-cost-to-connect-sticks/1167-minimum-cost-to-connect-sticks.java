class Solution {
    public int connectSticks(int[] sticks) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a: sticks) pq.add(a);
        while(pq.size()>1){
            int l1 = pq.poll();
            int l2 = pq.poll();
            cost += (l1+l2);
            pq.add(l1+l2);
        }
        return cost;
    }
}