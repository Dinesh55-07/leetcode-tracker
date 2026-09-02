// Last updated: 02/09/2026, 10:23:36
1class NumMatrix {
2    int[][] sum;
3    public NumMatrix(int[][] matrix) {
4        int m = matrix.length, n = matrix[0].length;
5        sum = new int[m + 1][n + 1]; // sum[i][j] is sum of all elements inside the rectangle [0,0,i,j]
6        for (int i = 1; i <= m; i++) {
7            for (int j = 1; j <= n; j++) {
8                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
9            }
10        }
11    }
12    public int sumRegion(int r1, int c1, int r2, int c2) {
13        r1++; c1++; r2++; c2++; // Since our `sum` starts by 1 so we need to increase r1, c1, r2, c2 by 1
14        return sum[r2][c2] - sum[r2][c1 - 1] - sum[r1 - 1][c2] + sum[r1 - 1][c1 - 1];
15    }
16}
17
18/**
19 * Your NumMatrix object will be instantiated and called as such:
20 * NumMatrix obj = new NumMatrix(matrix);
21 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
22 */