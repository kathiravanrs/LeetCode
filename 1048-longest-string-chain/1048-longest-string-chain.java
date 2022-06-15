// class Solution {
//     public int longestStrChain(String[] words) {
//         // System.out.println(isP("bdcae", "bdcaeb"));
//         List<String> list = new ArrayList<>();
//         for(String word: words) list.add(word);
//         Set<Set<String>> sets = joinString(list);
//         System.out.println(joinSet(sets));
//         System.out.println(sets);
//         return 0;
//     }
    
//     public Set<Set<String>> joinString(List<String> words){
//         Set<Set<String>> lists = new HashSet<>();
//         for(int i = 0;i<words.size()-1;i++){
//             for(int j=i+1;j<words.size();j++){
//                 if(isP(words.get(i), words.get(j))) 
//                     lists.add(new HashSet<>(List.of(words.get(i), words.get(j))));
//             }
//         }
//         return lists;
//     }
    
    
//     public Set<Set<String>> joinSet(Set<Set<String>> sets){
//         for(Set<String> set1: sets){
//             for(Set<String> set2: sets){
//                 if(set1.equals(set2)) continue;
//                 for(String s: set1){
//                     if(set2.contains(s)){
//                         set1.addAll(set2);
//                         continue;
//                     }
//                 }
//             }
//         }
//         return sets;
//     }
    
//     public boolean isP(String w1, String w2){
//         int l1 = w1.length();
//         int l2 = w2.length();
//         if(Math.abs(l1-l2)!=1) return false;
        
//         int idx1 = 0, idx2 = 0;
//         boolean op = false;        
//         while(idx1<l1&&idx2<l2){
//             if(w1.charAt(idx1) == w2.charAt(idx2)){
//                 idx1++;
//                 idx2++;
//             }
//             else{
//                 if(op) return false;
//                 try{
//                     if(w1.charAt(idx1) == w2.charAt(idx2+1)){
//                         idx1++;
//                         idx2 += 2;
//                         op = true;
//                     }
//                     else if(w1.charAt(idx1+1) == w2.charAt(idx2)){
//                         idx1+=2;
//                         idx2 ++;
//                         op = true;
//                     }
//                 }
//                 catch(Exception e){
                    
//                 }
//             }
            
//         }
//         return true;
        
//     }
// }


class Solution {

    private int dfs(Set<String> words, Map<String, Integer> memo, String currentWord) {
        // If the word is encountered previously we just return its value present in the map (memoization).
        if (memo.containsKey(currentWord)) {
            return memo.get(currentWord);
        }
        // This stores the maximum length of word sequence possible with the 'currentWord' as the
        int maxLength = 1;
        StringBuilder sb = new StringBuilder(currentWord);

        // creating all possible strings taking out one character at a time from the `currentWord`
        for (int i = 0; i < currentWord.length(); i++) {
            sb.deleteCharAt(i);
            String newWord = sb.toString();
            // If the new word formed is present in the list, we do a dfs search with this newWord.
            if (words.contains(newWord)) {
                int currentLength = 1 + dfs(words, memo, newWord);
                maxLength = Math.max(maxLength, currentLength);
            }
            sb.insert(i, currentWord.charAt(i));
        }
        memo.put(currentWord, maxLength);

        return maxLength;
    }

    public int longestStrChain(String[] words) {
        Map<String, Integer> memo = new HashMap<>();
        Set<String> wordsPresent = new HashSet<>();
        Collections.addAll(wordsPresent, words);
        int ans = 0;
        for (String word : words) {
            ans = Math.max(ans, dfs(wordsPresent, memo, word));
        }
        return ans;
    }
}
