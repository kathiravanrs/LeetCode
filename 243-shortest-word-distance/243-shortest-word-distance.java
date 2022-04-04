class Solution {

    //     public int shortestDistance(String[] wordsDict, String word1, String word2) {
    //         List<Integer> f = new ArrayList<>();
    //         List<Integer> s = new ArrayList<>();

    //         int i=-1;
    //         for(String w : wordsDict){
    //             i++;
    //             if(w.equals(word1)) f.add(i);
    //             if(w.equals(word2)) s.add(i);
    //         }
    //         Set<Integer> set = new TreeSet<>();

    //         for(int k: f){
    //             for(int j: s){
    //                 set.add(Math.abs(k-j));
    //             }
    //         }
    //         return (int)set.toArray()[0];
    //     }

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int p1 = -1;
        int p2 = -1;
        int res = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                p1 = i;
            }
            if (wordsDict[i].equals(word2)) {
                p2 = i;
            }
            if(p1 !=-1 && p2!=-1){
                res = Math.min(res, Math.abs(p1-p2));
            }
        }
        return res;
    }
}
