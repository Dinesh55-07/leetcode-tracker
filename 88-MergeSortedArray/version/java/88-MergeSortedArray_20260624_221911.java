// Last updated: 24/06/2026, 22:19:11
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m;
4
5        for(int j=0; j<n; j++){
6            nums1[i] = nums2[j];
7            i++;
8        }
9        Arrays.sort(nums1);
10    }
11}