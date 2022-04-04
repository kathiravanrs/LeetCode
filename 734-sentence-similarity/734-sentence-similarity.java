class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        Set<List<String>> s = new HashSet<>();
        s.addAll(similarPairs);
        if(sentence1.length!=sentence2.length) return false;
        else{
            for(int i=0;i<sentence1.length;i++){
                if(sentence1[i].equals(sentence2[i])) continue;
                List<String> t1 = new ArrayList<>();
                List<String> t2 = new ArrayList<>();
                t1.add(sentence1[i]);
                t1.add(sentence2[i]);
                
                t2.add(sentence2[i]);
                t2.add(sentence1[i]);
                
                if(!(s.contains(t1)||s.contains(t2))) return false;
            }
        }
        return true;
    }
}