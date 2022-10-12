class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int a : candyType){
            set.add(a);
        }
        return Math.min(set.size(), candyType.length/2);
    }
}