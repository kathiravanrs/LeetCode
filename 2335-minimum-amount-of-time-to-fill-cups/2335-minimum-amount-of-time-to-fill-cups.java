class Solution {
    public int fillCups(int[] amount) {
        int n = amount.length-1;
        int time = 0;
        Arrays.sort(amount);
        while(amount[n]!=0){
            time++;
            amount[n] = amount[n]-1;
            if(amount[n-1]>0) amount[n-1] = amount[n-1]-1;
            Arrays.sort(amount);

        }
        return time;
    }
}