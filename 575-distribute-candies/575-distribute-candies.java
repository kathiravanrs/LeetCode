class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for(int a: candyType){
            s.add(a);
        }
        return Math.min(candyType.length/2, s.size());
    }
}