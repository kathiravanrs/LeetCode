class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = lowLimit;i<=highLimit;i++){
            map.put(dSum(i), map.getOrDefault(dSum(i),0)+1);
            max = Math.max(max, map.get(dSum(i)));
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