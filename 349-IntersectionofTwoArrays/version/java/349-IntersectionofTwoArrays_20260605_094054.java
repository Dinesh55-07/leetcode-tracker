// Last updated: 05/06/2026, 09:40:54
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set = new HashSet<>();
4        Set<Integer> resSet = new HashSet<>();
5
6        for (int num:nums1){
7            set.add(num);
8        }
9
10        for (int num:nums2){
11            if(set.contains(num)){
12                resSet.add(num);
13            }
14        }
15
16        int res[] = new int[resSet.size()];
17        int i=0;
18
19        for (int num:resSet){
20            res[i++] = num;
21        
22        }
23
24        return res;
25    }
26}