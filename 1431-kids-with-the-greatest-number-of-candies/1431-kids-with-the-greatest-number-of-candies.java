class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int a: candies){
            max = Math.max(max, a);
        }
        List<Boolean> l = new ArrayList<>();
        for(int a:candies){
            l.add( a+extraCandies>=max);
        }
        return l;
    }
}