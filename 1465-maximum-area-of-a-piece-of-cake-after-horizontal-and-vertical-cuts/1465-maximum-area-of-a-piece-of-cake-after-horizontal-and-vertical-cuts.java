class Solution {

    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        long l = Math.max(h-hc[hc.length-1], hc[0]);
        long b = Math.max(w-vc[vc.length-1], vc[0]);
        
        for (int i = 1; i < hc.length; i++) {
            long diffL = hc[i] - hc[i - 1];
            l = Math.max(diffL, l);
        }
        for (int j = 1; j < vc.length; j++) {
            long diffW = vc[j] - vc[j-1];
            b = Math.max(b, diffW);
        }

        return (int) ((l * b) % 1000000007);
    }
}
