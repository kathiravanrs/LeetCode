class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int a: salary){
            if(a>max) max = a;
            if(a<min) min = a;
            sum += a;
        }
        return (sum-min-max)/(salary.length-2);
    }
}