class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new TreeMap<>();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        StringBuilder b = new StringBuilder();
        for(char c: map.values()){
            b.append(c);
        }
        return b.toString();
    }
}