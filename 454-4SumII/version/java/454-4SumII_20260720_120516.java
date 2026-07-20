// Last updated: 20/07/2026, 12:05:16
1class Solution {
2    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
3    Map<Integer, Integer> map = new HashMap<>();
4    
5    for(int i=0; i<C.length; i++) {
6        for(int j=0; j<D.length; j++) {
7            int sum = C[i] + D[j];
8            map.put(sum, map.getOrDefault(sum, 0) + 1);
9        }
10    }
11    
12    int res=0;
13    for(int i=0; i<A.length; i++) {
14        for(int j=0; j<B.length; j++) {
15            res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
16        }
17    }
18    
19    return res;
20}
21}