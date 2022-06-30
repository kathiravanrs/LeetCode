class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int pre = image[sr][sc];
        if(pre!=color) fill(image, sr, sc, pre, color);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int pre, int color) {
        if (pre == image[sr][sc]) {
            image[sr][sc] = color;
            if (sr > 0) fill(image, sr - 1, sc, pre, color);
            if (sc > 0) fill(image, sr, sc - 1, pre, color);
            if (sr < image.length-1) fill(image, sr + 1, sc, pre, color);
            if (sc < image[0].length-1) fill(image, sr, sc + 1, pre, color);
        }
    }
}
