// Last updated: 14/06/2026, 21:21:41
1class Solution {
2    public int minimizeArrayValue(int[] A) {
3        long sum = 0, res = 0;
4        for (int i = 0; i < A.length; ++i) {
5            sum += A[i];
6            res = Math.max(res, (sum + i) / (i + 1));
7        }
8        return (int)res;
9    }
10}