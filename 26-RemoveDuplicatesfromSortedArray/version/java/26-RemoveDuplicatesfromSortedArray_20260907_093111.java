// Last updated: 07/09/2026, 09:31:11
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length == 0) return 0;
4
5        int res = 1;
6        for (int i=1; i<nums.length; i++){
7            if (nums[i] != nums[i-1]){
8                nums[res] = nums[i];
9                res++;
10            }
11
12        }
13        return res;
14    }
15}