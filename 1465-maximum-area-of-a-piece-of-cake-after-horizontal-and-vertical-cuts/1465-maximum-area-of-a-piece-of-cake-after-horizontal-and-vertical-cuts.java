class Solution {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        List<Long> hz = new ArrayList<>();
        List<Long> vr = new ArrayList<>();
        hz.add(0l);
        vr.add(0l);
        for (int a : horizontalCuts) {
            hz.add((long) a);
        }
        for (int a : verticalCuts) {
            vr.add((long) a);
        }
        hz.add((long) h);
        vr.add((long) w);

        Collections.sort(hz);
        Collections.sort(vr);

        int max = 0;
        long ml = 0;
        long mw = 0;
        System.out.println(hz);
        System.out.println(vr);
        for (int i = 0; i < hz.size() - 1; i++) {
            long l = hz.get(i + 1) - hz.get(i);
            ml = Math.max(ml, l);
        }
        for (int j = 0; j < vr.size() - 1; j++) {
            long b = vr.get(j + 1) - vr.get(j);
            mw = Math.max(mw, b);
            // int area =((int) (l*b)%(1000000007));
            // max = Math.max(max, area);
        }
        System.out.println(ml + " " + mw);
        return (int) ((ml * mw) % 1000000007);
    }
}
