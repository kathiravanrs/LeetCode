class NumMatrix {
    List<List<Integer>> mat = new ArrayList<>();

    public NumMatrix(int[][] matrix) {
        List<Integer> firstRow = new ArrayList<>();
        for (int i = 0; i < matrix[0].length + 1; i++) {
            firstRow.add(0);
        }
        mat.add(firstRow);

        for (int i = 0; i < matrix.length; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(0);
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j] + mat.get(i).get(j + 1) + curRow.get(j) - mat.get(i).get(j);
                curRow.add(val);
            }
            mat.add(curRow);
        }
        System.out.println(mat);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int a = mat.get(row2+1).get(col2+1);
        int b = mat.get(row1).get(col2+1);
        int c = mat.get(row2+1).get(col1);
        int d = mat.get(row1).get(col1);
        System.out.println(a + " " + b + " " + c + " " + d);
        return a + d - b - c;
    }
}
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
