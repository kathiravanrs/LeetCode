class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = lowLimit;i<=highLimit;i++){
            int val = dSum(i);
            map.put(val, map.getOrDefault(val,0)+1);
            max = Math.max(max, map.get(val));
        }
        return max;
    }
    
    public int dSum(int n){
        int sum = 0;
        while(n>0){
            sum+= n%10;
            n = n/10;
        }
        return sum;
    }
}