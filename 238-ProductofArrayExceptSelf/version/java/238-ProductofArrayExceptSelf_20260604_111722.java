// Last updated: 04/06/2026, 11:17:22
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int res[] = new int[n];
5
6        int pre = 1;
7        int suf = 1;
8
9        for (int i=0; i < n; i++){
10            res[i] = pre;
11            pre *= nums[i];
12        }
13
14        for (int i = n-1; i >= 0; i--){
15            res[i] *= suf;
16            suf *= nums[i];
17        }
18        return res;
19    }
20}