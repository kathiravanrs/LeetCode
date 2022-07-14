class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for(int[] a: accounts){
            int tempSum = 0;
            for(int b: a){
                tempSum+=b;
            }
            if(tempSum>sum) sum = tempSum;
        }
        return sum;
        
    }
}