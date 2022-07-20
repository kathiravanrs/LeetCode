class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        List<String>[] head = new List[26];
        for(int i=0;i<head.length;i++) head[i] = new ArrayList<String>();
        for(String word: words){
            int pos = word.charAt(0)-'a';
            head[pos].add(word);
        }
        for(char c: s.toCharArray()){
            List<String> l = head[c-'a'];
            if(l.isEmpty()) continue;
            int n=l.size();
            for(int i=0;i<n;i++){
                String word = l.get(0);
                if(word.length()==1) {
                    count++;
                }
                else head[word.charAt(1)-'a'].add(word.substring(1));
                l.remove(word);
            }
        }
        System.out.println(head);
        return count;
    }
}