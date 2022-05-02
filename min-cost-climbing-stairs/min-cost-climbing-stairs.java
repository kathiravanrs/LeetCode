class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> map = new HashMap<>();
        return Math.min(c(cost, map,0), c(cost, map,1));
    }
    
    public int c(int[] cost, Map<Integer, Integer> map, int l){
        if(!map.containsKey(l)){
            if(cost.length - l == 1 || cost.length - l == 2) map.put(l, cost[l]);
            else{
                map.put(l, cost[l]+Math.min(c(cost, map, l+1),c(cost, map, l+2)));
            }
        }
        return map.get(l);
    }
}