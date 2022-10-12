class Solution {
    public int distributeCandies(int[] candyType) {
        int l = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<l;i++) set.add(candyType[i]);
        int s = set.size();
        if(l==s) return l/2;
        return Math.min(s, l/2);
    }
}