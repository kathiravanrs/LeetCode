class Solution {
    public int distributeCandies(int[] candyType) {
        int l = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<l;i++) set.add(candyType[i]);
        
        return Math.min(set.size(), l/2);
    }
}