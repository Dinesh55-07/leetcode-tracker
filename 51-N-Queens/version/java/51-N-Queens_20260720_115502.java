// Last updated: 20/07/2026, 11:55:02
1class Solution {
2    private boolean isSafePlace(int n, char[][] nQueens, int row, int col) {
3        for (int i = 0; i < n; i++) {
4            if (nQueens[i][col] == 'Q') {
5                return false;
6            }
7        }
8
9        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
10            if (nQueens[i][j] == 'Q') {
11                return false;
12            }
13        }
14
15        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
16            if (nQueens[i][j] == 'Q') {
17                return false;
18            }
19        }
20
21        return true;
22    }
23
24    private void solveNQueens(int n, List<List<String>> output, char[][] nQueens, int row) {
25        if (row == n) {
26            List<String> solution = new ArrayList<>();
27            for (char[] rowArray : nQueens) {
28                solution.add(new String(rowArray));
29            }
30            output.add(solution);
31            return;
32        }
33
34        for (int col = 0; col < n; col++) {
35            if (isSafePlace(n, nQueens, row, col)) {
36                nQueens[row][col] = 'Q';
37                solveNQueens(n, output, nQueens, row + 1);
38                nQueens[row][col] = '.';
39            }
40        }
41    }
42
43    public List<List<String>> solveNQueens(int n) {
44        List<List<String>> output = new ArrayList<>();  
45        char[][] nQueens = new char[n][n];  
46        
47        for (int i = 0; i < n; i++) {
48            Arrays.fill(nQueens[i], '.');
49        }
50        
51        solveNQueens(n, output, nQueens, 0); 
52        return output;
53    }
54}