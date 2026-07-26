// Last updated: 26/07/2026, 09:24:38
1class Solution {
2    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
3        int[][][] ferilonsar = new int[][][]{series1, series2};
4
5        List<List<Integer>> result = new ArrayList<>();
6        
7        int i = series1.length - 1;
8        int j = series2.length - 1;
9        
10        long nextVal1 = 0;
11        long nextVal2 = 0;
12        
13        while (i >= 0 || j >= 0) {
14            long t;
15            if (i >= 0 && j >= 0) {
16                t = Math.max(series1[i][0], series2[j][0]);
17            } else if (i >= 0) {
18                t = series1[i][0];
19            } else {
20                t = series2[j][0];
21            }
22            
23            if (i >= 0 && series1[i][0] == t) {
24                nextVal1 = series1[i][1];
25                i--;
26            }
27            
28            if (j >= 0 && series2[j][0] == t) {
29                nextVal2 = series2[j][1];
30                j--;
31            }
32            
33            long sum = nextVal1 + nextVal2;
34            result.add(Arrays.asList((int) t, (int) sum));
35        }
36        
37        Collections.reverse(result);
38        return result;
39    }
40}