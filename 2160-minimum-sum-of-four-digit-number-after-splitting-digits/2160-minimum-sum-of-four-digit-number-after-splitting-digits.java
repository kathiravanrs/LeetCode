class Solution {
    public int minimumSum(int num) {
        int a = num/1000;
        int b = num/100 - 10*a;
        int c = num/10 - 100*a - 10*b;
        int d = num - 1000*a - 100*b - 10*c;
        int[] res= new int[]{a,b,c,d};
        Arrays.sort(res);
        return res[0]*10 + res[1]*10 + res[2]+res[3];
    }
}