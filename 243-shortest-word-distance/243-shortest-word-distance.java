class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        List<Integer> f = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        
        int i=-1;
        for(String w : wordsDict){
            i++;
            if(w.equals(word1)) f.add(i);
            if(w.equals(word2)) s.add(i);
        }
        Set<Integer> set = new TreeSet<>();
        
        for(int k: f){
            for(int j: s){
                set.add(Math.abs(k-j));
            }
        }
        return (int)set.toArray()[0];
    }
}