// Last updated: 03/08/2026, 09:01:50
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int l = 1;
7        int r = n;
8
9        while (l <= r){
10            int m = l + (r - l) / 2;
11
12            if (isBadVersion(m)){
13                r = m - 1;
14            }else{
15                l = m + 1;
16            }
17        }
18
19        return l;
20    }
21}