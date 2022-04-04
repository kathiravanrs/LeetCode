class Solution {

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int sum = 0;
        int[] res = new int[2];
        for (char c : s.toCharArray()) {
            sum += widths[c - 'a'];
            if (sum > 100) {
                lines++;
                sum = widths[c - 'a'];
            }
        }
        res[0] = lines;
        res[1] = sum;
        return res;
    }
}
