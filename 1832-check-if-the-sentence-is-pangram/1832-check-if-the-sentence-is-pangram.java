class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] a = new int[26];
        for(int i=0;i<sentence.length();i++){
            int c = sentence.charAt(i)-'a';
            a[c]++;
        }
        for(int i: a) if(i==0) return false;
        return true;
    }
}