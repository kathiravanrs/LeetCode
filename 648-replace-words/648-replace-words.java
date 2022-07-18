class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder ans = new StringBuilder();
        String[] s = sentence.split(" ");
        Set<String> dic = new TreeSet<>(new Comparator<String>(){
            public int compare(String s1, String s2){
                int l1 = s1.length();
                int l2 = s2.length();
                if(l1==l2) return s1.compareTo(s2);
                return Integer.compare(s1.length(), s2.length());
            }
        });
        dic.addAll(dictionary);
        for(String word: s){
            String va = word;
            for(String pre: dic){
                if(word.startsWith(pre)) {
                    va = pre;
                    break;
                }
                    
            }
            ans.append(va + " ");
        }
        
        return ans.toString().trim();
    }
}