class Solution {
    public int mySqrt(int x) {
        int i = 1;
        while(true){
            if(i>x/i)break;
            i++;
        }
        return --i;
    }
}