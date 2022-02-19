class Solution {

    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int min = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;;

        for (int a : nums) {
            int t = a;
            if (a % 2 == 1) t= 2*a; 
            
            min = Math.min(min, t);
            maxHeap.offer(t);
        }
        
        int max;
        while(!maxHeap.isEmpty()){
            max = maxHeap.poll();
            diff = Math.min(diff, max-min);

            if(max%2==0){
                max = max/2;
                maxHeap.offer(max);
                min = Math.min(min, max);
            }
            else break;
        }
        return diff;
        
    }
}
