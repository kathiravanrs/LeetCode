class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
                                      "..",".---","-.-",".-..","--","-.","---",".--.",
                                      "--.-",".-.","...","-","..-","...-",".--","-..-",
                                      "-.--","--.."};
        
        Set<String> transformations = new HashSet<>();
        for(String word:words){
            StringBuilder b = new StringBuilder();
            for(char c: word.toCharArray()){
                b.append(table[c-'a']);
            }
            transformations.add(b.toString());
        }
        
        return transformations.size();
    }
}