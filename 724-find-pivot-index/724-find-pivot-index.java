class Solution {

    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            try {
                left[i] = left[i - 1] + nums[i - 1];
            } catch (Exception e) {
                left[i] = 0;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            try {
                right[i] = nums[i + 1] + right[i + 1];
            } catch (Exception e) {
                right[i] = 0;
            }
        }

        for (int a : left) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : right) {
            System.out.print(a + " ");
        }

        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (left[i] == right[i]) {res = i; break;}
        }
        return res;
    }
}
