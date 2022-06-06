class Solution {
    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int prev = 0;
        for(char a:word.toCharArray()){
            int pos = keyboard.indexOf(a);
            time += Math.abs(prev - pos);
            prev = pos;
            
        }
        return time;
    }
}