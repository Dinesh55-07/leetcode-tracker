// Last updated: 24/07/2026, 10:27:19
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n=nums.length;
4        int[] res=new int[n];
5        for(int i=0;i<n;i++){
6            res[i]=nums[i]*nums[i];
7        }
8        Arrays.sort(res);
9        return res;
10    }
11}