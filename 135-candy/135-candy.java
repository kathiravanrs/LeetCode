class Solution {

    public int candy(int[] ratings) {
        int[] lr = new int[ratings.length];
        int[] rl = new int[ratings.length];
        Arrays.fill(rl, 1);
        Arrays.fill(lr, 1);

        int count = 0;
        for (int i = 1; i < rl.length; i++) {
            if (ratings[i] > ratings[i - 1] && lr[i] <= lr[i - 1]) lr[i] = lr[i - 1] + 1;
        }
        for (int i = lr.length-2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && rl[i] <= rl[i + 1]) rl[i] = rl[i + 1] + 1;
        }
        for(int i = 0;i<rl.length;i++){
            count += Math.max(rl[i],lr[i]);
        }
        return count;
        // for (int a : res) {
        //     boolean changed = false;
        //     for (int i = 0; i < ratings.length; i++) {
        //         try {
        //             if (ratings[i] > ratings[i - 1] && res[i] <= res[i - 1]) {
        //                 res[i] = res[i - 1] + 1;
        //                 changed = true;
        //             }
        //         } catch (Exception e) {}
        //         try {
        //             if (ratings[i] > ratings[i + 1] && res[i] <= res[i + 1]) {
        //                 res[i] = res[i + 1] + 1;
        //                 changed = true;
        //             }
        //         } catch(Exception e) {}
        //     }
        //     if(!changed) break;
        // }
        // int count = 0;
        // for (int a : res) {
        //     System.out.print(a + " ");
        //     count += a;
        // }
        //
        // return count;
    }
}
