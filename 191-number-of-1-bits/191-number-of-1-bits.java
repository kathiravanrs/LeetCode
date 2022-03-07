public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        int s = 0;
        for(char b: a.toCharArray()){
            if(b=='1') s++;
        }
        return s;
    }
}