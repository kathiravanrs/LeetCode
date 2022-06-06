class Solution {
    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int pos = 0;
        for(char a:word.toCharArray()){
            time += Math.abs(pos - keyboard.indexOf(a));
            pos = keyboard.indexOf(a);
            
        }
        return time;
    }
}